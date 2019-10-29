package core.chapter03._4._2;

import org.springframework.beans.propertyeditors.CustomDateEditor;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * CustomDateEditor
 * 自定义日期和字符串的转换
 *
 * @author wangpp
 */
public class CustomDateEditorExample {
    public static void main(String[] args) {

        CustomDateEditor customDateEditor = new CustomDateEditor(new SimpleDateFormat("yyyy::mm::dd"), false);
        customDateEditor.setAsText("1999::12::10");
        Date value = (Date) customDateEditor.getValue();
        System.out.println(value);

        CustomDateEditor customDateEditor2 = new CustomDateEditor(new SimpleDateFormat("yyyy~mm~dd"), false);
        customDateEditor2.setAsText("1999~12~10");
        Date value2 = (Date) customDateEditor2.getValue();
        System.out.println(value2);


    }
}
