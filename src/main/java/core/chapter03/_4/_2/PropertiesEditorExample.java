package core.chapter03._4._2;

import org.springframework.beans.propertyeditors.PropertiesEditor;

import java.util.Properties;

/**
 * PropertiesEditor
 * 文字与属性的转换
 *
 * @author wangpp
 */
public class PropertiesEditorExample {
    public static void main(String[] args) {
        PropertiesEditor propertiesEditor = new PropertiesEditor();
        propertiesEditor.setAsText("name=wpp\nage=11");
        Properties value = (Properties) propertiesEditor.getValue();
        System.out.println(value.getProperty("name"));
        System.out.println(value.getProperty("age"));


        propertiesEditor.setValue(new Properties() {{
            put("name", "w");
            put("age", "21");
        }});

        String asText = propertiesEditor.getAsText();
        System.out.println(asText);


    }

}
