package sporadic.java_generics;

public class ParentClass {

	@Override
	public String toString() {
		return "This class is serving as the parent class for other classes to extend to demo java genric types for my own understanding.\nIt's calling the parent class: SteveSunParentClass [getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
