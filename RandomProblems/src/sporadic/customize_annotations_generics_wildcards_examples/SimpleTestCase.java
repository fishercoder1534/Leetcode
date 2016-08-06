package sporadic.customize_annotations_generics_wildcards_examples;

import org.junit.Assert;

public class SimpleTestCase {
	@SteveSunFirstCustomAnnotation(name = "test1WithCustomName", state = MyTestState.ACTIVE)
    public void test1() {
	    Assert.assertEquals(2, 1 + 1);
	    Assert.assertEquals(Integer.parseInt("-3"), -3);
    }
     
    @SteveSunFirstCustomAnnotation(expected = NumberFormatException.class)
    public void test2() {
        Integer.parseInt("1.23ddd");
    }
     
    @SteveSunFirstCustomAnnotation(state = MyTestState.INACTIVE)
    public void test3() {
        throw new IllegalStateException("Test case is inactive");
    }
    
}
