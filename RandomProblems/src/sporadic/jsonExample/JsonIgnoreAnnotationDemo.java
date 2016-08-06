package sporadic.jsonExample;

import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JsonIgnoreAnnotationDemo {

	public static void main(String... args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-configuration/json-spring-configuration.xml");
		JsonDemoClass jsonDemoClass = (JsonDemoClass) context.getBean("jsonDemoClass");

		ObjectMapper mapper = new ObjectMapper();

		jsonDemoClass.setId(1);
		jsonDemoClass.setName("Test program!");
		jsonDemoClass.setAnotherMember(123);
		jsonDemoClass.setForgetThisField(123.456);
		jsonDemoClass.setNoInterestingMember("Something not interesting!");

		String s = null;
		try {
			s = mapper.writeValueAsString(jsonDemoClass);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("String s is: " + s);
		
		JsonDemoClass jsonDemoClass2 = (JsonDemoClass) context.getBean("jsonDemoClass");
		try {
			jsonDemoClass2 = mapper.readValue(s, JsonDemoClass.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("jsonDemoClass2.toString() s is: " + jsonDemoClass2.toString() + "\nThe end.");
	}

}
