# Converter SPI

```java
package org.springframework.core.convert.converter;

import org.springframework.lang.Nullable;

@FunctionalInterface
public interface Converter<S, T> {
    @Nullable
    T convert(S var1);
}

```
实现自定义的Converter，只要实现上面的接口，然后在DefaultConversionService注册即可

Spring提供了一些默认实现.在包 org.springframework.core.convert.support 
```java
package org.springframework.core.convert.support;

final class StringToBooleanConverter implements Converter<String, Boolean> {
    static {
            trueValues.add("true");
            trueValues.add("on");
            trueValues.add("yes");
            trueValues.add("1");
            falseValues.add("false");
            falseValues.add("off");
            falseValues.add("no");
            falseValues.add("0");
        }
     public Boolean convert(String source) {
            String value = source.trim();
            if (value.isEmpty()) {
                return null;
            } else {
                value = value.toLowerCase();
                if (trueValues.contains(value)) {
                    return Boolean.TRUE;
                } else if (falseValues.contains(value)) {
                    return Boolean.FALSE;
                } else {
                    throw new IllegalArgumentException("Invalid boolean value '" + source + "'");
                }
            }
        }
}
```
