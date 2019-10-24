package core.chapter05.s5_4_6.aspect_instantiation_models;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * 切面的生命周期
 * 默认情况下，应用程序上下文中每个方面都有一个实例。
 * AspectJ将此称为单例实例化模型。可以使用备用生命周期来定义方面。
 * Spring支持AspectJ的perthis和pertarget实例化模型（当前不支持percflow，percflowbelow和pertypewithin）。
 * <p>
 * <p>
 * 在前面的示例中，“ perthis”子句的作用是为每个执行业务服务的唯一服务对象（每个与切入点表达式匹配的联接点绑定到“ this”的唯一对象）创建一个方面实例。
 * 方面实例是在服务对象上首次调用方法时创建的。
 * 当服务对象超出范围时，方面将超出范围。
 * 在创建方面实例之前，其中的任何建议都不会执行。
 * 创建方面实例后，在其中声明的建议将在匹配的连接点处执行，但是仅当服务对象是与此方面相关联的对象时才执行。
 * <p>
 * 有关每个子句的更多信息，请参见AspectJ编程指南。
 * pertarget实例化模型的工作方式与perthis完全相同，但是它在匹配的连接点为每个唯一目标对象创建一个方面实例。
 *
 * @author wpp
 */
@Aspect("perthis(core.chapter05.s5.S05User.name())")
public class MyAspect {
    private int someState;

    @Before(value = "execution(* core.chapter05.s5.S05User.name())")
    public void recordServiceUsage() {
        //...
    }
}

