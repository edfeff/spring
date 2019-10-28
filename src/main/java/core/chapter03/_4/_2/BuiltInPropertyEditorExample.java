package core.chapter03._4._2;

/**
 * 内置的 PropertyEditor 实现
 * <p>
 * PropertyEditors 用于String和Object之间的互相转换
 * 将特定的PropertyEditors设置到BeanWrapper或IOC时，可以完成字符串到特定类型的转换
 * spring中的应用
 * 1. bean的set属性方法都是通过PropertyEditors设置的
 * 2. xml中的class属性是通过ClassEditor设置的
 * 3. springmvc框架中的http请求参数都是通过各种的propertyeditor实现的
 * 4.spring内置的 PropertyEditor都在包org.springframework.beans.propertyeditors中,一般都是通过BeanWrapperImpl进行注册
 *
 * @author wangpp
 */
public class BuiltInPropertyEditorExample {
    public static void main(String[] args) {

    }
}
