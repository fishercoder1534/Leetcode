package spring_import_annotation;

/** This is a class used for MainApp to demo @Import annotation.*/
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class App1Config {

	@Bean
	public App1 app1() {
		return new App1();
	}
}
