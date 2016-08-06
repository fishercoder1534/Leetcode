package pureXMLDependencyInjecttionExample;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class City {
	@Getter
	@Setter
	private String cityName;
	
	@Getter
	@Setter
	private String area;

}