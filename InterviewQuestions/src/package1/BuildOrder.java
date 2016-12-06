package package1;
import java.util.*;

import utils.CommonUtils;

public class BuildOrder {
    /*
    Input:

    main.go: [fetch_module.go, process_module.go, output_module.go, stats_collector.go]
    fetch_module.go [ data_source_alpha.go, data_source_beta.go, stats_collector.go]
    process_module.go: [filter_module.go, enhance_module.go, stats_collector.go]
    output_module.go [service_connection.go, stats_collector.go]

    Get the order in which a compiler will build these files

    Rule:

    1. Before building a file, all its dependent modules should be built
    2. If two files that are not dependent on each other then the order does not matter.

    Output:
    A order of compilation given the list of dependent modules

    */

    //output: output_module.go, process_module.go, fetch_module.go, main.go

    public static List<String> findDepedencies(Map<String, List<String>> input){
        Set<String> zeroDegree = new HashSet();
        Queue<String> queue = new LinkedList();
        Map<String, Integer> map = new HashMap();
        for(String key : input.keySet()){
            if(!map.containsKey(key)){
                map.put(key, input.get(key).size());
            } else {
                map.put(key, map.get(key) + input.get(key).size());
            }
            for(String sub : input.get(key)){
                if(!map.containsKey(sub)){
                    map.put(sub, 0);
                }
                else {
                    map.put(sub, map.get(sub) + 1);
                }
            }
        }

        for(String k : map.keySet()){
            if(map.get(k) == 0){
                zeroDegree.add(k);
                queue.offer(k);
            }
        }

        while(!queue.isEmpty()){
            Iterator<String> iter = zeroDegree.iterator();
            String module = iter.next();
            zeroDegree.remove(module);
            for(String k : input.keySet()){
                if(k.equals(module)){
                    map.put(k, map.get(k)-1);
                    if(map.get(k) == 0){
                        zeroDegree.add(k);
                        queue.offer(k);
                    }
                }
            }
        }

        List<String> result = new ArrayList();
        while(!queue.isEmpty()){
            result.add(queue.poll());
        }

        return result;
    }
    
    public static void main(String...strings){
        /**
         * main.go: [fetch_module.go, process_module.go, output_module.go, stats_collector.go]
    fetch_module.go [ data_source_alpha.go, data_source_beta.go, stats_collector.go]
    process_module.go: [filter_module.go, enhance_module.go, stats_collector.go]
    output_module.go [service_connection.go, stats_collector.go]*/
        Map<String, List<String>> input = new HashMap();
        String main = "main.go";
        String fetch = "fetch_module.go";
        String process = "process_module.go";
        String output_module = "output_module.go";
        String stats_collector = "stats_collector.go";
        String data_source_alpha = "data_source_alpha.go";
        String data_source_beta = "data_source_beta.go";
        String filter_module = "filter_module.go";
        String enhance_module = "enhance_module.go";
        String service_connection = "service_connection.go";
        
        List<String> mainList = new ArrayList();
        mainList.add(fetch);
        mainList.add(process);
        mainList.add(output_module);
        mainList.add(stats_collector);
        input.put(main, mainList);
        
        List<String> fetchList = new ArrayList();
        fetchList.add(data_source_alpha);
        fetchList.add(data_source_beta);
        fetchList.add(stats_collector);
        input.put(fetch, fetchList);
        
        List<String> processList = new ArrayList();
        processList.add(filter_module);
        processList.add(enhance_module);
        processList.add(stats_collector);
        input.put(process, processList);
        
        List<String> outputList = new ArrayList();
        outputList.add(service_connection);
        outputList.add(stats_collector);
        input.put(output_module, outputList);
        
        List<String> result = findDepedencies(input);
        CommonUtils.print(result);
    }
}
