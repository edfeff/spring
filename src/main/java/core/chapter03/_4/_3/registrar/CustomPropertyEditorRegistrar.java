package core.chapter03._4._3.registrar;

import core.chapter03._4._3.custom.Address;
import core.chapter03._4._3.custom.AddressPropertyEditor;
import core.chapter03._4._3.custom.ExoticType;
import core.chapter03._4._3.custom.ExoticTypeEditor;
import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;

/**
 * @author wangpp
 */
public class CustomPropertyEditorRegistrar implements PropertyEditorRegistrar {
    @Override
    public void registerCustomEditors(PropertyEditorRegistry registry) {
        registry.registerCustomEditor(ExoticType.class, new ExoticTypeEditor());
        registry.registerCustomEditor(Address.class, new AddressPropertyEditor());
    }
}
