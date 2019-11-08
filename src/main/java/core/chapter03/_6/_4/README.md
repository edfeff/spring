# 3.6.4. FormatterRegistrar SPI
---
FormatterRegistrar是一个SPI，用于通过FormatterRegistry注册格式器和转换器：

```java

public interface FormatterRegistrar {

	void registerFormatters(FormatterRegistry registry);
}

```
为给定的格式类别（例如日期格式）注册多个相关的转换器和格式器时，FormatterRegistrar很有用。 
在声明式注册不足的情况下，此方法也很有用。 
例如，当格式化程序需要在不同于其自身<T>的特定字段类型下进行索引时，
或者在注册“Printer/Parser”对时。 
下一节将提供有关转换器和格式化程序注册的更多信息。