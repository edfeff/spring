package core.chapter04._3._17;

import core.chapter04._3.Inventor;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 集合选择
 * <p>
 * Selection uses the syntax
 * 选取集合
 * X.?[selectionExpression].
 * 选取第一个
 * X.^[selectionExpression]
 * 选取最后一个
 * X.$[selectionExpression]
 *
 * @author wangpp
 */
public class CollectionSelectionExample {
    public static void main(String[] args) {
        m1();
        m2();
        firstElement();
        lastElement();
    }

    private static void firstElement() {
        List<Inventor> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Inventor inventor = Inventor.getInventor("n" + i);
            inventor.getPlaceOfBirth().setCity("city" + i);
            list.add(inventor);
        }
        MemberHolder memberHolder = new MemberHolder(list);

        ExpressionParser parser = new SpelExpressionParser();
        Inventor value = (Inventor) parser
                .parseExpression("members.^[name=='n1']").getValue(memberHolder);
        System.out.println(value);
    }

    private static void lastElement() {
        List<Inventor> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Inventor inventor = Inventor.getInventor("n" + i);
            inventor.getPlaceOfBirth().setCity("city" + i);
            list.add(inventor);
        }
        MemberHolder memberHolder = new MemberHolder(list);

        ExpressionParser parser = new SpelExpressionParser();
        Inventor value = (Inventor) parser
                .parseExpression("members.$[name=='n1']").getValue(memberHolder);
        System.out.println(value);
    }

    private static void m2() {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        MapHolder holder = new MapHolder(map);
        ExpressionParser parser = new SpelExpressionParser();
        Map<String, Integer> value = (Map<String, Integer>) parser.parseExpression("map.?[value<3]").getValue(holder);
        Map<String, Integer> value1 = (Map<String, Integer>) parser.parseExpression("map.^[value<3]").getValue(holder);
        Map<String, Integer> value2 = (Map<String, Integer>) parser.parseExpression("map.$[value<3]").getValue(holder);

        System.out.println(value);
        System.out.println(value1);
        System.out.println(value2);
    }

    /**
     * 遍历筛选 list元素
     */
    private static void m1() {
        List<Inventor> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Inventor inventor = Inventor.getInventor("n" + i);
            inventor.getPlaceOfBirth().setCity("city" + i);
            list.add(inventor);
        }
        MemberHolder memberHolder = new MemberHolder(list);
        ExpressionParser parser = new SpelExpressionParser();
        List<Inventor> value = (List<Inventor>) parser.parseExpression("members.?[name=='n1']").getValue(memberHolder);
        System.out.println(value);

    }
}

class MapHolder {
    Map<String, Integer> map = null;

    public MapHolder(Map<String, Integer> map) {
        this.map = map;
    }

    public Map<String, Integer> getMap() {
        return map;
    }

    public void setMap(Map<String, Integer> map) {
        this.map = map;
    }
}

class MemberHolder {
    List<Inventor> members = null;

    public MemberHolder(List<Inventor> members) {
        this.members = members;
    }

    public List<Inventor> getMembers() {
        return members;
    }

    public void setMembers(List<Inventor> members) {
        this.members = members;
    }
}