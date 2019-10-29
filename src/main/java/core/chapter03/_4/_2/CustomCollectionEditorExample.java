package core.chapter03._4._2;

import org.springframework.beans.propertyeditors.CustomCollectionEditor;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * CustomCollectionEditor
 * 集合和字符串的转换
 *
 * @author wangpp
 */
public class CustomCollectionEditorExample {
    public static void main(String[] args) {

        CustomCollectionEditor ArrayListCustomCollectionEditor = new CustomCollectionEditor(ArrayList.class);
        ArrayListCustomCollectionEditor.setAsText("1,2,3,4");
        ArrayList list = (ArrayList) ArrayListCustomCollectionEditor.getValue();
        System.out.println(list + "  " + list.getClass());

        CustomCollectionEditor HashSetCustomCollectionEditor = new CustomCollectionEditor(HashSet.class);
        HashSetCustomCollectionEditor.setAsText("1,2,3,4");
        HashSet set = (HashSet) HashSetCustomCollectionEditor.getValue();
        System.out.println(set + "  " + set.getClass());

    }
}
