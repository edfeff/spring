package core.chapter03._4._2;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;

/**
 * StringTrimmerEditor
 * 去除指定的符号
 *
 * @author wangpp
 */
public class StringTrimmerEditorExample {
    public static void main(String[] args) {
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor("@#", false);
        stringTrimmerEditor.setAsText("@#@h#e#l#l####o #w#o#r#l#d@@");
        String value = (String) stringTrimmerEditor.getValue();
        System.out.println(value);
    }
}
