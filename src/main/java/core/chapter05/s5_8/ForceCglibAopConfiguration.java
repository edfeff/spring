package core.chapter05.s5_8;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 强制使用CGLIB 代理
 */
@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ForceCglibAopConfiguration {
}
