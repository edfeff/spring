package core.chapter04._3._5;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import java.util.Arrays;

/**
 * 数组可以使用java的语法定义
 *
 * @author wangpp
 */
public class ArrayConstructionSpelExample {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();

        int[] arr1 = (int[]) parser.parseExpression("new int[4]").getValue();
        System.out.println(Arrays.toString(arr1));
        System.out.println(arr1.length);

        int[] arr2 = (int[]) parser.parseExpression("new int[]{1,2,3,4}").getValue();
        System.out.println(Arrays.toString(arr2));

        //目前多维数组不允许初始化
        int[][] arr3 = (int[][]) parser.parseExpression("new int[4][5]").getValue();
        System.out.println(arr3.length);

    }

}
