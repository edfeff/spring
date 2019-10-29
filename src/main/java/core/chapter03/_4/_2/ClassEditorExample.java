package core.chapter03._4._2;

import org.springframework.beans.propertyeditors.ClassEditor;

/**
 * ClassEditor 使用示例
 *
 * @author wangpp
 */
public class ClassEditorExample {
    public static void main(String[] args) {
        ClassEditor classEditor = new ClassEditor();
        classEditor.setAsText("core.chapter03._4._1.Company");
        Object value = classEditor.getValue();
        System.out.println(value);

    }
}
