package core.chapter05.s5_4_7.an_aop_example;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 标记用的注解
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Idempotent {
}
