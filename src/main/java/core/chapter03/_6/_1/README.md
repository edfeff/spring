# Formatter SPI
用于实现字段逻辑的Formatter SPI非常简单且类型强大
```java

package org.springframework.format;

public interface Formatter<T> extends Printer<T>, Parser<T> {
    
}

@FunctionalInterface
public interface Printer<T> {

	String print(T object, Locale locale);

}

@FunctionalInterface
public interface Parser<T> {

	T parse(String text, Locale locale) throws ParseException;

}

```
---
要创建自己的Formatter，请实现前面显示的Formatter接口。 
将T参数化为您要格式化的对象类型-例如，java.util.Date。 
- 实现print（）操作以打印到T的实例以在客户端语言环境中显示。 
- 实现parse（）操作以从格式表示形式解析T的实例。您的
如果解析尝试失败，则格式化程序应引发ParseException或IllegalArgumentException。 
注意确保您的格式化程序实现是线程安全的。
---
格式子包为方便起见提供了几种Formatter实现。 
数量包提供了NumberStyleFormatter，CurrencyStyleFormatter和PercentStyleFormatter来
格式使用java.text.NumberFormat的Number对象。 
datetime软件包提供了一个DateFormatter，用于使用java.text.DateFormat格式化java.util.Date对象。 
datetime.joda软件包提供了基于Joda-Time库的全面的日期时间格式支持。
---
## DateFormatter 
