package core.chapter03._4._2;

import org.springframework.beans.propertyeditors.URLEditor;

import java.net.URL;

/**
 * URLEditor
 * 字符串与URL的转换
 *
 * @author wangpp
 */
public class URLEditorExample {
    public static void main(String[] args) {
        URLEditor urlEditor = new URLEditor();
        urlEditor.setAsText(".");
        URL value = (URL) urlEditor.getValue();

        System.out.println(value.getClass() + " " + value);
    }

}
