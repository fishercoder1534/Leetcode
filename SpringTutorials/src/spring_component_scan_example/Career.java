package spring_component_scan_example;

import lombok.Getter;
import lombok.ToString;

import org.springframework.stereotype.Service;

@Service
@ToString
public class Career {
	@Getter 
	private String jobType;
	
	@Getter 
	private int jobLevel;
}
