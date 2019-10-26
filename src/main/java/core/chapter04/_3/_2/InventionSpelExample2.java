package core.chapter04._3._2;

import core.chapter04._3.Inventor;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.SimpleEvaluationContext;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 数组
 * <p>
 * 列表
 *
 * @author wpp
 */
public class InventionSpelExample2 {
    public static void main(String[] args) {
        EvaluationContext context = SimpleEvaluationContext.forReadOnlyDataBinding().build();
        Inventor tesla = Inventor.getInventor();
        ExpressionParser parser = new SpelExpressionParser();
        // 数组 取值
        String value = parser.parseExpression("inventions[3]").getValue(context, tesla, String.class);
        System.out.println(value);

        //list
        MemberHolder memberHolder = getMemberHolder();
        String name = parser.parseExpression("members[0].name").getValue(context, memberHolder, String.class);
        System.out.println(name);

        //list与array
        String mi = parser.parseExpression("members[0].inventions[1]").getValue(context, memberHolder, String.class);
        System.out.println(mi);

//        map
        OfficerHolder officerHolder = getOfficerHolder();
        Inventor president = parser.parseExpression("officers['president']").getValue(context, officerHolder, Inventor.class);
        System.out.println(president.getName());
        String city = parser.parseExpression("officers['president'].placeOfBirth.city").getValue(context, officerHolder, String.class);
        System.out.println(city);

    }

    private static MemberHolder getMemberHolder() {
        MemberHolder memberHolder = new MemberHolder();
        memberHolder.members = Arrays.asList(Inventor.getInventor("XX"), Inventor.getInventor("YY"), Inventor.getInventor("ZZ"));
        return memberHolder;
    }

    private static OfficerHolder getOfficerHolder() {
        OfficerHolder holder = new OfficerHolder();
        Map<String, Inventor> officers = new HashMap<>();
        officers.put("president", Inventor.getInventor("president"));
        holder.setOfficers(officers);
        return holder;
    }
}

class OfficerHolder {
    private Map<String, Inventor> officers;

    public Map<String, Inventor> getOfficers() {
        return officers;
    }

    public void setOfficers(Map<String, Inventor> officers) {
        this.officers = officers;
    }
}

class MemberHolder {
    public List<Inventor> members;
}

