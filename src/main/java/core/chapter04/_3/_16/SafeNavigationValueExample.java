package core.chapter04._3._16;

import core.chapter04._3.Inventor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.SimpleEvaluationContext;
import org.springframework.stereotype.Component;

/**
 * Safe Navigation operator
 * 用于@Value
 *
 * @author wangpp
 */
@Component
public class SafeNavigationValueExample {
    /**
     * 放置在成员变量上,当 pop3.port为null时，取出默认值 25
     */
    @Value( "#{systemProperties['pop3.port']?:25}" )
    private Integer defaultPort;

    @Override
    public String toString() {
        return "SafeNavigationValueExample{" +
                "defaultPort=" + defaultPort +
                '}';
    }

    public Integer getDefaultPort() {
        return defaultPort;
    }

    public void setDefaultPort(Integer defaultPort) {
        this.defaultPort = defaultPort;
    }
}