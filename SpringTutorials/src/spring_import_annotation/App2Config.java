package spring_import_annotation;

/** This is a class used for MainApp to demo @Import annotation.*/
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import common.TextEditor;


@Configuration
@Import(App1Config.class)
public class App2Config {

    @Bean
    public App1 app1() {
        return new App1();
    }

    @Bean
    public App2 app2() {
        return new App2();
    }

    @Bean(initMethod = "init", destroyMethod = "cleanup")
    public TextEditor textEditor() {
        return new TextEditor(null);
    }
}
