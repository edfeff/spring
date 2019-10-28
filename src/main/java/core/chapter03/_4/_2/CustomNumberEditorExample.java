package core.chapter03._4._2;

import org.springframework.beans.propertyeditors.CustomNumberEditor;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * CustomNumberEditor
 * 数字和字符串的转换
 *
 * @author wangpp
 */
public class CustomNumberEditorExample {
    public static void main(String[] args) {
        CustomNumberEditor customNumberEditor = new CustomNumberEditor(Integer.class, false);
        customNumberEditor.setAsText("12");
        Object value = customNumberEditor.getValue();
        System.out.println(value);

        CustomNumberEditor customNumberEditor2 = new CustomNumberEditor(Float.class, false);
        customNumberEditor2.setAsText("12.01");
        Object value2 = customNumberEditor2.getValue();
        System.out.println(value2);
    }
}
