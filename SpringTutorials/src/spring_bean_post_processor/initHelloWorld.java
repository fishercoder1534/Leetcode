package spring_bean_post_processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class initHelloWorld implements BeanPostProcessor {

    public initHelloWorld() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName)
            throws BeansException {
        System.out.println("Before Initialization : " + beanName);
        return bean; // you can return any other object as well
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName)
            throws BeansException {
        System.out.println("After Initialization : " + beanName);
        return bean; // you can return any other object as well
    }

}
