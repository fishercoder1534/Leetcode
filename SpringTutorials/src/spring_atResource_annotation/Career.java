package spring_atResource_annotation;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Career {
	@Getter
	@Setter
	private String jobType;
	
	@Getter
	@Setter
	private int jobLevel;
}
