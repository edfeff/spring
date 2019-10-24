package core.chapter05.s5_5_7;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 标记用的注解
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Idempotent {
}
