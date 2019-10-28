package core.chapter03._4._2;

import org.springframework.beans.propertyeditors.PatternEditor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * PatternEditor
 * 正则表达式与字符串的转换
 *
 * @author wangpp
 */
public class PatternEditorExample {
    public static void main(String[] args) {
        PatternEditor patternEditor = new PatternEditor();
        patternEditor.setAsText("^\\d+$");
        Pattern regex = (Pattern) patternEditor.getValue();

        Matcher matcher = regex.matcher("1234");
        System.out.println(matcher.matches());

        Matcher matcher1 = regex.matcher("aa1");
        System.out.println(matcher1.matches());

    }

}
