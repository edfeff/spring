package core.chapter03._4;

import core.chapter03._2.Person;
import core.chapter03._2.customer.Address;
import core.chapter03._2.customer.Customer;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.PropertyValue;

/**
 * 使用BeanWrapper 来设置和获取对象的属性
 *
 * @author wangpp
 */
public class BeanWrapperExample {
    public static void main(String[] args) {
        //1 class
        BeanWrapper classBeanWrapper = new BeanWrapperImpl(Person.class);
        Class<?> wrappedClass = classBeanWrapper.getWrappedClass();
        System.out.println(wrappedClass);

        //2 object
        Person person = new Person();
        BeanWrapper objBeanWrapper = new BeanWrapperImpl(person);
        Object wrappedInstance = objBeanWrapper.getWrappedInstance();
        System.out.println(wrappedInstance);

        //2.1 设置属性
        //        直接通过属性名设置
        objBeanWrapper.setPropertyValue("name", "wpp");
        System.out.println(person);
        //通过  PropertyValue设置属性
        PropertyValue ageProperty = new PropertyValue("age", 27);
        objBeanWrapper.setPropertyValue(ageProperty);
        System.out.println(person);

//        2.2 获取属性
        int age = (int) objBeanWrapper.getPropertyValue("age");
        System.out.println(age);

        //2,3 嵌套属性
        Address address = new Address("home");
        Customer customer = new Customer("f", "l", address);
        BeanWrapper customerBeanWrapper = new BeanWrapperImpl(customer);

        String cityPropertyValue = (String) customerBeanWrapper.getPropertyValue("address.city");
        System.out.println(cityPropertyValue);


    }
}
