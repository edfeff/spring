package core.chapter03._4._2;

import org.springframework.beans.propertyeditors.ByteArrayPropertyEditor;

/**
 * ByteArrayPropertyEditor
 * 字节数组与字符串之间的转换
 *
 * @author wangpp
 */
public class ByteArrayPropertyEditorExample {
    public static void main(String[] args) {

        ByteArrayPropertyEditor byteArrayPropertyEditor = new ByteArrayPropertyEditor();

        byte[] bytes = "hello".getBytes();
        byteArrayPropertyEditor.setValue(bytes);
        String asText = byteArrayPropertyEditor.getAsText();
        System.out.println(asText);

        byteArrayPropertyEditor.setAsText("world");
        byte[] value = (byte[]) byteArrayPropertyEditor.getValue();
        System.out.println(value);
        System.out.println(new String(value));


    }
}
