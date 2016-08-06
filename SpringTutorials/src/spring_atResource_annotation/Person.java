package spring_atResource_annotation;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Getter;
import lombok.Setter;

public class Person {
	@Resource(name = "home123") 
	@Getter
	private City city;

	@Resource(name = "wife") 
	@Getter 
	private Wife wife;
	
	//I gave it a shot here, I must use this @Resource annotation and define this bean in the .xml file, otherwise it throws exception!
	//B/c this one is using <context:annotation-config />, you can find this line in spring.xml.
	@Resource(name = "careerCurrent") 
	@Getter
	private Career career;
	
}