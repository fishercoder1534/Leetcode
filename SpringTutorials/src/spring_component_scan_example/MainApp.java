package spring_component_scan_example;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**This app is running fine! It helps me understand how component scan works! Cool!
* Look at this project along with other two:
 * Spring@ResourceAnnotationExample
 * SpringComponentScanExample
 * to help me better understand the three possible ways to do DI using Spring.*/

public class MainApp {

    public static void main(String... args) {
    	AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring_component_scan_example/spring.xml");
            Person p =(Person) context.getBean("person");

            System.out.println(p.getCity().toString());
            System.out.println(p.getWife().toString());
            System.out.println(p.getCareer().toString());
    } 
}