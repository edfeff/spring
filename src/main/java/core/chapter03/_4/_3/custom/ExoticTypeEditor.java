package core.chapter03._4._3.custom;

import java.beans.PropertyEditorSupport;

/**
 * 自定义PropertyEditor
 *
 * @author wangpp
 */
public class ExoticTypeEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        System.out.println("转换 " + text);
        setValue(new ExoticType(text.toUpperCase()));
    }
}
