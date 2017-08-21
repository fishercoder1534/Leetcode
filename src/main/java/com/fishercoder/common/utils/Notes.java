package com.fishercoder.common.utils;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface Notes {

    String todo() default "";

    String problemReview() default "";

    String issue() default "";

    String context() default ""; // this variable is used to state how I solved
    // this problem, whether completely made it
    // myself, or copied it from online, or a
    // combination of both approaches.

    boolean needsReview() default true;

}
