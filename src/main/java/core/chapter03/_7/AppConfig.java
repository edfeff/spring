package core.chapter03._7;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.format.datetime.DateFormatterRegistrar;
import org.springframework.format.number.NumberFormatAnnotationFormatterFactory;
import org.springframework.format.support.DefaultFormattingConversionService;
import org.springframework.format.support.FormattingConversionService;

/**
 * 自定义日期格式化器
 *
 * @author wangpp
 */
@Configuration
public class AppConfig {
    @Bean
    public FormattingConversionService conversionService() {
        DefaultFormattingConversionService conversionService = new DefaultFormattingConversionService(false);
        conversionService.addFormatterForFieldAnnotation(new NumberFormatAnnotationFormatterFactory());

        DateFormatterRegistrar registrar = new DateFormatterRegistrar();

        registrar.setFormatter(new DateFormatter(("yyyyMMdd")));

        registrar.registerFormatters(conversionService);

        return conversionService;
    }
}
