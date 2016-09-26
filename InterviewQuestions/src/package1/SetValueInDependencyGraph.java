package package1;

import java.util.*;;


public class SetValueInDependencyGraph {
	public static void main(String...strings){

		Map<String, List<String>> dependenceMap = new HashMap();
		
		List<String> list1 = new ArrayList();
		list1.add("B");
		list1.add("C");
		
		List<String> list2 = new ArrayList();
		list2.add("A");
		list2.add("C");
		list2.add("D");
		
		List<String> list3 = new ArrayList();
		list3.add("E");
		
		List<String> list4 = new ArrayList();
		list4.add("A");
		
		dependenceMap.put("A", list1);
		dependenceMap.put("B", list2);
		dependenceMap.put("C", list3);
		dependenceMap.put("E", list4);
		
		SetValueInDependencyGraph.Method.setValue_v2("A", 1, dependenceMap);
	
	}
	
	static class Method{
		public static void setValue_v2(String columnName, int value, Map<String, List<String>> depedenceMap){
			Map<String, Integer> result = new HashMap();
			result.put(columnName, value);
			
			Queue<String> queue = new LinkedList();
			queue.offer(columnName);
			
			while(!queue.isEmpty()){
				int size = queue.size();
				for(int i = 0; i < size; i++){
					String currCol = queue.poll();
					int thisValue = result.get(currCol);
					if(!depedenceMap.containsKey(currCol)) continue;
					for(String dep : depedenceMap.get(currCol)){
						if(!result.containsKey(dep)){
							result.put(dep, thisValue+1);
							queue.offer(dep);
						}
					}
				}
			}
			
			for(String key : result.keySet()){
				System.out.println(key + "\t" + result.get(key));
			}
		}
		
		
		public void setValue_v1_stopped_by_interviewer(String columnName, int value, Map<String, List<String>> depedenceMap){
			Map<String, Integer> result = new HashMap();
			for(String colName : depedenceMap.keySet()){
				if(!result.containsKey(colName)){
					result.put(colName, value);
				}
				for(String dep : depedenceMap.get(colName)){
					if(!result.containsKey(dep)){
						result.put(dep, result.get(colName)+1);
					}
				}
			}
		}
		
		
	}
}
