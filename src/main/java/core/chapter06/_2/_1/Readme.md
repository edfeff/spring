# 6.2. Pointcut API in Spring
Let’s look at how Spring handles the crucial pointcut concept.
## 6.2.1. Concepts
Spring’s pointcut model enables pointcut reuse independent of advice types. It’s possible to target
different advice using the same pointcut.
---
spring 的pointcut模型使得切入点可以独立于切面类型。使得多个切面共用一个切入点成为可能。

Pointcut是核心接口，两个方法使得切入点可以被类和方法的切面复用，同时可以和其他类和方法进行切点组合
```java
package org.springframework.aop;

public interface Pointcut {
    Pointcut TRUE = TruePointcut.INSTANCE;
    ClassFilter getClassFilter();
    MethodMatcher getMethodMatcher();
}
```

ClassFilter 用于指定什么类型的Class可以接受

```java
package org.springframework.aop;
@FunctionalInterface
public interface ClassFilter {
    ClassFilter TRUE = TrueClassFilter.INSTANCE;
    boolean matches(Class<?> var1);
}
```
MethodMatcher 用于指定某个Class的某个方法是否可以接受
```java
package org.springframework.aop;
import java.lang.reflect.Method;

public interface MethodMatcher {
    MethodMatcher TRUE = TrueMethodMatcher.INSTANCE;
    //在AOP创建时执行，进行判断    
    boolean matches(Method var1, Class<?> var2);
    
    boolean isRuntime();

    //每次方法调用都会调用此方法，使得方法可以根据参数来决定方法的走向    
    boolean matches(Method var1, Class<?> var2, Object... var3);
}
```
Most MethodMatchers are static, meaning that their isRuntime() method returns false. In this case,
the 3-argument matches method will never be invoked.
多数的MethodMatcher都是静态的，意味着 isRuntime为false，3个参数的方法在此情况下不后悔被调用
如果可以，尽量使用static，可以使用AOP框架的缓存机制

## 6.2.2. Operations on pointcuts
Spring supports operations on pointcuts: notably, union and intersection.
• Union means the methods that either pointcut matches.
• Intersection means the methods that both pointcuts match.
• Union is usually more useful.
• Pointcuts can be composed using the static methods in the
org.springframework.aop.support.Pointcuts class, or using the ComposablePointcut class in the
same package. However, using AspectJ pointcut expressions is usually a simpler approach.

spring支持切入点的 交 并 
- 并 任意满足一切点
- 交 同时满足多个切点
- 使用org.springframework.aop.support.Pointcuts 和 org.springframework.aop.support.ComposablePointcut 进行切点的编排
- 同时使用AspectJ表达式会使得简化上述的编排操作


---
总结
原始的PointCut接口，可以进行2个方面的匹配，类和方法。分别对应ClassFilter 和 MethodFilter接口。
为了灵活性，spring允许多个PointCut进行交和并的运算，这是通过类ComposablePointCut实现的。
为了支持ClassFilter的运算，加入了类UnionClassFilter 和IntersectionClassFilter，同理，为了MethodFilter的运算，加入了 UnionMethodMatcher 和IntersectionMethodMatcher