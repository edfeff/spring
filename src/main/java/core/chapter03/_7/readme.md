# 修改全局日期时间格式
默认，对于没有标注@DateTImeFormat的时间和日期字段，spring使用DateFormat.SHORT格式进行转换

可以使用
org.springframework.format.datetime.joda.JodaTimeFormatterRegistrar or
或
org.springframework.format.datetime.DateFormatterRegistrar 
进行替换。

