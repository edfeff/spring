#  Spring Field Formatting
如上一节所述，core.convert是一种通用类型转换系统
提供统一的ConversionService API以及用于以下目的的强类型Converter SPI
实现从一种类型到另一种类型的转换逻辑。 Spring Container使用此系统来
绑定bean属性值。此外，Spring Expression Language（SpEL）和
DataBinder使用此系统绑定字段值。例如，当需要强制SpEL时，
一个Long要完成一个expression.setValue（对象bean，对象值）的尝试，将core.convert
系统执行强制。
现在考虑典型客户端环境的类型转换要求
桌面应用程序。在这种环境下，您通常会从String转换为支持客户端
回发过程以及返回字符串另外，你
通常需要本地化字符串值。更通用的core.convert转换器SPI无法解决
这样的格式要求直接。为了直接解决您的问题，Spring 3引入了一个方便的方法
格式化程序SPI为客户端的PropertyEditor提供了一种简单而强大的替代方法
环境。
通常，当您需要实现通用类型时，可以使用SPI转换器
转换逻辑-例如，用于在java.util.Date和Long之间进行转换。你可以用
在客户端环境中工作时需要格式化Formatter SPI
解析并打印本地化的字段值。 ConversionService提供统一的类型转换API
对于两个SPI