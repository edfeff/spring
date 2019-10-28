package core.chapter03._4._2;

import org.springframework.beans.propertyeditors.CustomBooleanEditor;

/**
 * CustomBooleanEditor
 * 可用于定制true和false对应的字符串
 * <p>
 * 示例
 * T true
 * F false
 *
 * @author wangpp
 */
public class CustomBooleanEditorExample {
    public static void main(String[] args) {
        CustomBooleanEditor customBooleanEditor = new CustomBooleanEditor("T", "F", true);

        customBooleanEditor.setAsText("T");

        Object t = customBooleanEditor.getValue();
        System.out.println(t);

        customBooleanEditor.setAsText("F");
        Object f = customBooleanEditor.getValue();
        System.out.println(f);

        customBooleanEditor.setAsText("");
        Object n = customBooleanEditor.getValue();
        System.out.println(n);


    }
}
