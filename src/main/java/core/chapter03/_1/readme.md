# JSR-303 / JSR-349 Bean验证
> 就设置支持而言，Spring Framework 4.0支持Bean验证1.0（JSR-303）和Bean验证1.1（JSR-349），还使其适应了Spring的Validator接口。
应用程序可以选择一次在全局启用Bean验证（如Spring验证中所述），并将其专用于所有验证需求。
应用程序还可以为每个DataBinder实例注册其他Spring Validator实例，如配置DataBinder中所述。这对于在不使用注释的情况下插入验证逻辑可能很有用。

考虑将验证作为业务逻辑是有利有弊，Spring提供了一种验证（和数据绑定）设计，但并不排除其中任何一个。
特定的验证不应与Web层绑定，应该易于本地化并且应该可以插入任何可用的验证器。
考虑到上述情况，Spring提供了一个Validator接口，该接口既基本又可以在应用程序的每一层中使用。

数据绑定对于允许将用户输入动态绑定到应用程序的域模型（或用于处理用户输入的任何对象）很有用。
Spring提供了所谓的DataBinder来做到这一点。 
Validator和DataBinder组成了验证包，该验证包主要用于但不限于MVC框架。

BeanWrapper是Spring框架中的基本概念，并在很多地方使用。
但是，您可能不需要直接使用BeanWrapper。
但是，因为这是参考文档，所以我们认为可能需要进行一些解释。
我们将在本章中解释BeanWrapper，因为如果您要使用它，则在尝试将数据绑定到对象时最有可能使用它。

Spring的DataBinder和较低级别的BeanWrapper都使用PropertyEditor来解析和格式化属性值。 
PropertyEditor概念是JavaBeans规范的一部分，本章还将对此进行说明。
Spring 3引入了一个“ core.convert”包，该包提供了常规的类型转换工具，以及一个用于格式化UI字段值的高级“ format”包。
这些新软件包可以用作PropertyEditor的更简单替代方案，并且还将在本章中进行讨论。