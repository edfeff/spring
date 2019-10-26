package core.chapter04._3._2;

import core.chapter04._3.Inventor;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * @author wpp
 */
public class InventionSpelExample2 {
    public static void main(String[] args) {
        Inventor context = Inventor.getInventor();
        ExpressionParser parser = new SpelExpressionParser();
        parser.parseExpression("inventions[3]").getValue(context)


    }


}
