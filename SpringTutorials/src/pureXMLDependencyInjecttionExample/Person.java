package pureXMLDependencyInjecttionExample;

import lombok.Getter;
import lombok.Setter;

public class Person {
	@Getter
	@Setter
	private City city;

	@Getter 
	@Setter
	private Wife wife;
	
	@Getter
	@Setter
	private Career career;
	
}