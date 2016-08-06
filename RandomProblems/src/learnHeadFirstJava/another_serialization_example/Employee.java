package learnHeadFirstJava.another_serialization_example;

import java.io.Serializable;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

//Any one of the following three annotations: @Service, @Repository and @Component will work fine here since I'm doing a component-scan.
//@Component
//@Repository
@Service
@RequiredArgsConstructor
public class Employee implements Serializable {
	@Setter
	@Getter
	private String address;
	@Setter
	@Getter
	private String name;
	@Setter
	@Getter
	private int age;
	@Setter
	@Getter
	private double salary;
	@Setter
	@Getter
	private transient int SSN;// any field that cannot be serialized needs to be
								// marked as transient, for demo purpose, we
								// just set SSN as a non-serializable field, it
								// doesn't mean anything, it's just that we
								// don't want to serialize it.

	public void mailCheck() {
		System.out.println("Mailing a check to " + name + " at " + address);
	}

	@Override
	public String toString() {//this toString() method doesn't contain SSN field either.
		return "Employee [address=" + address + ", name=" + name + ", age="
				+ age + ", salary=" + salary + "]";
	}

}
