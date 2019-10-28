package core.chapter03._4._1;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.PropertyValue;

/**
 * 内嵌属性的第二个例子
 *
 * @author wangpp
 */
public class CompanyAndEmployeeExample {
    public static void main(String[] args) {
        BeanWrapperImpl company = new BeanWrapperImpl(new Company());
        company.setPropertyValue("name", "Some Company Inc.");
        System.out.println(company.getWrappedInstance());

        PropertyValue value = new PropertyValue("name", "Other Company Inc.");
        company.setPropertyValue(value);
        System.out.println(company.getWrappedInstance());

        BeanWrapper jim = new BeanWrapperImpl(new Employee());
        jim.setPropertyValue("name", "Jim");
        jim.setPropertyValue("salary", 50000.99);
        company.setPropertyValue("managingDirector", jim.getWrappedInstance());

        float salary = (float) company.getPropertyValue("managingDirector.salary");
        System.out.println(salary);


    }
}
