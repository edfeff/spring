package core.chapter03._8._2.custom;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author wangpp
 */
public class MyConstraintValidator implements ConstraintValidator<MyConstraint, User> {

    @Override
    public boolean isValid(User value, ConstraintValidatorContext context) {
        return false;
    }
}
