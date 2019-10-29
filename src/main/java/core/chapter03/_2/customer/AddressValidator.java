package core.chapter03._2.customer;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * @author wangpp
 */
public class AddressValidator implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return Address.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors, "city", "city is empty");
    }
}
