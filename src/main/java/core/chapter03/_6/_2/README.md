#　3.6.2. Annotation-driven Formatting
注解驱动的格式化

---

Field格式化可以通过字段类型和注解配置，绑定一个注解到一个格式化器上时，实现AnnotationFormatterFactory即可

```java

public interface AnnotationFormatterFactory<A extends Annotation> {

	Set<Class<?>> getFieldTypes();

	Printer<?> getPrinter(A annotation, Class<?> fieldType);

	Parser<?> getParser(A annotation, Class<?> fieldType);

}

```
---
将A参数化为要与格式逻辑关联的字段注解类型，例如org.springframework.format.annotation.DateTimeFormat。 
让getFieldTypes（）返回可以在其上使用注释的字段的类型。 
让getPrinter（）返回打印机以打印带注释的字段的值。 
让getParser（）返回解析器以解析带注释字段的clientValue。
下面的示例AnnotationFormatterFactory实现将@NumberFormat Annotation绑定到格式化程序。 
此批注允许指定数字样式或模式：

---

```java


public class NumberFormatAnnotationFormatterFactory extends EmbeddedValueResolutionSupport
		implements AnnotationFormatterFactory<NumberFormat> {

	@Override
	public Set<Class<?>> getFieldTypes() {
		return NumberUtils.STANDARD_NUMBER_TYPES;
	}

	@Override
	public Printer<Number> getPrinter(NumberFormat annotation, Class<?> fieldType) {
		return configureFormatterFrom(annotation);
	}

	@Override
	public Parser<Number> getParser(NumberFormat annotation, Class<?> fieldType) {
		return configureFormatterFrom(annotation);
	}


	private Formatter<Number> configureFormatterFrom(NumberFormat annotation) {
		String pattern = resolveEmbeddedValue(annotation.pattern());
		if (StringUtils.hasLength(pattern)) {
			return new NumberStyleFormatter(pattern);
		}
		else {
			Style style = annotation.style();
			if (style == Style.CURRENCY) {
				return new CurrencyStyleFormatter();
			}
			else if (style == Style.PERCENT) {
				return new PercentStyleFormatter();
			}
			else {
				return new NumberStyleFormatter();
			}
		}
	}

}


```
