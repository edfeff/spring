package core.chapter03._2.customer;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * 校验Customer的类族
 * 组合AddressValidator
 *
 * @author wangpp
 */
public class CustomerValidator implements Validator {
    private final Validator addressValidator;

    public CustomerValidator(Validator addressValidator) {
        if (addressValidator == null) {
            throw new IllegalArgumentException("addressValidator is null");
        }
        if (!addressValidator.supports(Address.class)) {
            throw new IllegalArgumentException("addressValidator not support Address Validation!");
        }
        this.addressValidator = addressValidator;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return Customer.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstName", "firstName.Empty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastName", "lastName.Empty");
        Customer customer = (Customer) o;
        try {
            //向下校验,调用内嵌的校验器
            errors.pushNestedPath("address");
            ValidationUtils.invokeValidator(addressValidator, customer.getAddress(), errors);
        } finally {
            //回到上层校验
            errors.popNestedPath();
        }


    }
}
