package core.chapter04._3._4;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import java.util.Map;

/**
 * map
 * {key:value}
 * <p>
 * {:} 表示空的map
 *
 * @author wangpp
 */
public class InlineMapSpelExample {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();
        Map<String, String> normalMap = (Map<String, String>) parser.parseExpression("{name:'wpp',address:'home'}").getValue();
        System.out.println(normalMap);

        Map<String, Map<String, String>> mapofMap
                = (Map<String, Map<String, String>>) parser.parseExpression("{name:{first:'wpp',second:'pp'},address:{day:'10',hours:'9'}}").getValue();
        System.out.println(mapofMap);
    }
}
