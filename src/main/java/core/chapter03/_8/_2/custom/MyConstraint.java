package core.chapter03._8._2.custom;

import javax.validation.Constraint;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author wangpp
 */
@Target( {ElementType.METHOD, ElementType.FIELD} )
@Retention( RetentionPolicy.RUNTIME )
@Constraint( validatedBy = MyConstraintValidator.class )
public @interface MyConstraint {
}
