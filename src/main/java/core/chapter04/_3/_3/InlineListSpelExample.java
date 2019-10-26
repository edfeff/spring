package core.chapter04._3._3;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import java.util.List;

/**
 * Lists can be expressed directly in an expression using {} notation.
 * <p>
 * {} 表示空的list
 *
 * @author wangpp
 */
public class InlineListSpelExample {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();

        //简单的list
        List<Integer> integerList = (List<Integer>) parser.parseExpression("{1,2,3,4}").getValue();
        System.out.println(integerList);

        //list嵌套
        List<List<String>> listOfList = (List<List<String>>) parser.parseExpression("{{'a','b'},{'c','d'}}").getValue();
        System.out.println(listOfList);
        listOfList.forEach(e -> {
            e.forEach(System.out::println);
        });

    }
}
