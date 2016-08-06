package spring_component_scan_example;

import org.springframework.stereotype.Repository;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Repository
@ToString
public class City {
	@Getter
	private String cityName;
	
	@Getter
	private String area;

}