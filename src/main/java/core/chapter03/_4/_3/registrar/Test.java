package core.chapter03._4._3.registrar;

import core.chapter03._4._3.custom.DependsOnExoticType;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wangpp
 */
public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:core/chapter03/_4/_3/registrar/registrar-propertyEditor.xml");
        DependsOnExoticType bean = context.getBean(DependsOnExoticType.class);
        System.out.println(bean);
//        转换 aNameForExoticType
//        DependsOnExoticType{type=ExoticType{name='ANAMEFOREXOTICTYPE'}}
    }
}
