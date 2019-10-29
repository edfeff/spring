package core.chapter03._4._3.mvc;

import org.springframework.beans.PropertyEditorRegistrar;

/**
 * Spring MVC 中 自定义PropertyEditor会更简单
 *
 * @author wangpp
 */
public final class RegisterUserController {
    private final PropertyEditorRegistrar customPropertyEditorRegistrar;

    public RegisterUserController(PropertyEditorRegistrar propertyEditorRegistrar) {
        this.customPropertyEditorRegistrar = propertyEditorRegistrar;
    }

    /**
     * initBinder方法可以实现快速的绑定
     *
     * @param request
     * @param binder
     * @throws Exception
     */
//    protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) throws Exception {
//        this.customPropertyEditorRegistrar.registerCustomEditors(binder);
//    }
// other methods to do with registering a User
}