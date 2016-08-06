package sporadic.jsonExample;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**This package is to demo how @JsonIgnore and @JsonIgnorProperties and @JsonProperty work:
 * @JsonIgnore is to annotate a field or method to make it free from being seriazlied by json
 * @JsonIgnoreProperties is to annotate a class, and you must/may specifiy which properties you want json to skip serializing.
 * @JsonProperty is to annotate a field and give this field a specific name when Jackson does serialization, e.g. a name.*/


@NoArgsConstructor
@Service
@ToString
@JsonIgnoreProperties({"noInterestingMember", "forgetThisField"})
public class JsonDemoClass {
	@Getter
	@Setter
	@JsonProperty("ID")
	public long id;
	
	@Getter
	@Setter
	@JsonProperty("NAME")
	public String name;
	
	@Getter
	@Setter
	public String noInterestingMember;
	
	@Getter
	@Setter
	@JsonIgnore
	@JsonProperty("ANOTHER-MEMEBR")
	public int anotherMember;
	
	@Getter
	@Setter
	public double forgetThisField;
}