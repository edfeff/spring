package core.chapter03._4._3.custom;

import java.beans.PropertyEditorSupport;

/**
 * 自定义PropertyEditor
 *
 * @author wangpp
 */
public class AddressPropertyEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        String[] sourceArr = text.split(":");
        if (sourceArr.length != 2) {
            throw new IllegalArgumentException("Address String should be <name>:<gate>");
        }
        Address address = new Address();
        address.setName(sourceArr[0]);
        address.setGate(sourceArr[1]);
        setValue(address);
    }
}
