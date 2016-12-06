package spring_bean_post_processor;

/**This MainApp is working fine.*/
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppDemoBeanPostProcessor {
    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext(
                "spring_bean_post_processor/beansForDemoBeanPostProcessor.xml");

        common.HelloWorld obj = (common.HelloWorld) context.getBean("helloWorld");
        obj.getMessage();
        
        common.HelloChina obj2 = (common.HelloChina) context.getBean("helloChina");
        obj2.setMessage("China is saying hello to the rest of the world!");
//        obj2.getMessage();
        
        context.registerShutdownHook();

        System.out.println("The program ended! Cool!");
    }
}