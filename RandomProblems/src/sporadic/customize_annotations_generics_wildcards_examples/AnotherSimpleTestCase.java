package sporadic.customize_annotations_generics_wildcards_examples;


public class AnotherSimpleTestCase {
	@SteveSunFirstCustomAnnotation(expected = ArithmeticException.class)
    public void test4() {
        int a = 1/0;
    }
    
    @SteveSunFirstCustomAnnotation(ignore = ArithmeticException.class)
    public void test5() {
        int a = 1/0;
        System.out.println("a = " + a);
    }
}
