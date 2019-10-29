package core.chapter03._4._2;

import org.springframework.beans.propertyeditors.FileEditor;

import java.io.File;

/**
 * FileEditor
 * 文件与字符串的转换，相对于当前classPath路径
 *
 * @author wangpp
 */
public class FileEditorExample {
    public static void main(String[] args) {
        FileEditor fileEditor = new FileEditor();
        fileEditor.setAsText("a.txt");
        File value = (File) fileEditor.getValue();
        System.out.println(value + " " + value.getClass());
        System.out.println(value.getAbsolutePath());

    }
}
