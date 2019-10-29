package core.chapter03._2;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * 手写校验器 实现Validator接口
 *
 * @author wangpp
 */
public class PersonValidator implements Validator {
    /**
     * 需要校验的类型则返回true
     *
     * @param aClass
     * @return
     */
    @Override
    public boolean supports(Class<?> aClass) {
        return Person.class.equals(aClass);
    }

    /**
     * 对object进行校验，错误放入到errors中
     *
     * @param o
     * @param errors
     */
    @Override
    public void validate(Object o, Errors errors) {
        //工具类，非空判断
        ValidationUtils.rejectIfEmpty(errors, "name", "name.empty");
        Person person = (Person) o;
        if (person.getAge() < 0) {
            errors.rejectValue("value", "value less than 0");
        } else if (person.getAge() > 110) {
            errors.rejectValue("value", "value larger than 110");
        }
    }
}
