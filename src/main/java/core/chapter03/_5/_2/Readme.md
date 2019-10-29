# ConverterFactory
当需要把String转成Enum时，可以使用ConverterFactory
接口定义如下：
```java
package org.springframework.core.convert.converter;

public interface ConverterFactory<S, R> {
    <T extends R> Converter<S, T> getConverter(Class<T> var1);
}
```
Spring的StringToEnumConverterFactory示例
```java
package org.springframework.core.convert.support;

import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;

final class StringToEnumConverterFactory implements ConverterFactory<String, Enum> {
    StringToEnumConverterFactory() {
    }

    public <T extends Enum> Converter<String, T> getConverter(Class<T> targetType) {
        //返回了一个自定义的类StringToEnum，此类实现了Converter
        return new StringToEnumConverterFactory.StringToEnum(ConversionUtils.getEnumType(targetType));
    }
    // 将字符串 使用java.lang.Enum 类进行转换成枚举类    
    private static class StringToEnum<T extends Enum> implements Converter<String, T> {
        private final Class<T> enumType;

        public StringToEnum(Class<T> enumType) {
            this.enumType = enumType;
        }

        public T convert(String source) {
            return source.isEmpty() ? null : Enum.valueOf(this.enumType, source.trim());
        }
    }
}
```