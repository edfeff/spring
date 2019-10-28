package core.chapter03._4._2;

import org.springframework.beans.propertyeditors.LocaleEditor;

import java.util.Locale;

/**
 * LocaleEditor
 * 字符串与区域对象的转换
 *
 * @author wangpp
 */
public class LocaleEditorExample {
    public static void main(String[] args) {
        LocaleEditor localeEditor = new LocaleEditor();

        localeEditor.setAsText("zh_CN");
        Locale value = (Locale) localeEditor.getValue();
        System.out.println(value + " " + value.getClass());
        System.out.println(value.getCountry());

        Locale en = new Locale("en", "US");
        localeEditor.setValue(en);
        String asText = localeEditor.getAsText();
        System.out.println(asText);
    }

}
