#  FormatterRegistry SPI
---
FormatterRegistry 接口用于注册formatter 和converter

```java


public interface FormatterRegistry extends ConverterRegistry {
	void addFormatter(Formatter<?> formatter);

 	void addFormatterForFieldType(Class<?> fieldType, Formatter<?> formatter);

 	void addFormatterForFieldType(Class<?> fieldType, Printer<?> printer, Parser<?> parser);

	void addFormatterForFieldAnnotation(AnnotationFormatterFactory<? extends Annotation> annotationFormatterFactory);

}

``` 
FormattingConversionService  是基本通用的实现
---
可以使用 FormattingConversionServiceFactoryBean 以编程方式或声明方式将此实现配置为Spring bean。
由于此实现还实现了ConversionService，因此可以直接配置为与Spring的DataBinder和Spring表达式语言（SpEL）一起使用

如上所示，格式化程序可以通过fieldType或注释注册。
FormatterRegistry SPI允许您集中配置格式设置规则，而不必在控制器之间复制此类配置。 例如，您可能要强制执行所有日期
字段以某种方式格式化，或者带有特定注释的字段以某种方式格式化。 使用共享的FormatterRegistry，您可以一次定义这些规则，并且每当它们被应用时
需要格式化。...