package core.chapter03._8._3;

import org.springframework.validation.*;

import java.util.List;

/**
 * @author wangpp
 */
public class ConfigureDataBinder {
    public static void main(String[] args) {
        Foo foo = new Foo();
        DataBinder binder = new DataBinder(foo);
        binder.setValidator(new FooValidator());

        //验证
        binder.validate();
        BindingResult bindingResult = binder.getBindingResult();
        int errorCount = bindingResult.getErrorCount();
        if (errorCount > 0) {
            List<ObjectError> allErrors = bindingResult.getAllErrors();
            System.out.println(allErrors);
//            [Error in object 'target': codes [验证 结果 拒接.target,验证 结果 拒接]; arguments []; default message [null]]
        }
    }
}

class Foo {

}

class FooValidator implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {
        return Foo.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Foo foo = (Foo) o;
        valid(foo, errors);
    }

    private void valid(Foo foo, Errors errors) {
        //验证 foo
        errors.reject("验证 结果 拒接");
    }

}