package core.chapter04._3._18;


import core.chapter04._3.Inventor;
import core.chapter04._3.PlaceOfBirth;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import java.util.ArrayList;
import java.util.List;

/**
 * 集合投影
 * 类似于Stream的map转换
 *
 * @author wpp
 */
public class CollectionProjectionSpelExample {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();
        List<Inventor> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Inventor inventor = Inventor.getInventor("n" + i);
            inventor.getPlaceOfBirth().setCity("city" + i);
            list.add(inventor);
        }
        MemberHolder memberHolder = new MemberHolder(list);
        List<String> cityList = (List<String>) parser.parseExpression("members.![placeOfBirth.city]").getValue(memberHolder);
        System.out.println(cityList);

        List<PlaceOfBirth> placeOfBirthList = (List<PlaceOfBirth>) parser.parseExpression("members.![placeOfBirth]").getValue(memberHolder);
        System.out.println(placeOfBirthList);

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