package pureXMLDependencyInjecttionExample;

import lombok.Setter;

public class Person {
	@Setter
	private City city;

	@Setter
	private Wife wife;
	
	@Setter
	private Career career;

    public City getCity() {
        return city;
    }

    public Wife getWife() {
        return wife;
    }

    public Career getCareer() {
        return career;
    }
	
}