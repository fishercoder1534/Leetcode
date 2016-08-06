package sporadic.customize_annotations_generics_wildcards_examples;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface SteveSunFirstCustomAnnotation {
	String name() default "";

	MyTestState state() default MyTestState.ACTIVE;

	Class<? extends Throwable> expected() default None.class;

	static class None extends Throwable {}
	
	Class<? extends Throwable> ignore() default None.class;
}
