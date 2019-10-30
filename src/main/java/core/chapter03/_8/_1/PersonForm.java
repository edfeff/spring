package core.chapter03._8._1;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * JSR-303验证API示例
 *
 * @author wangpp
 */
public class PersonForm {
    @NotNull
    @Size( max = 64 )
    private String name;
    @Min( 0 )
    private int age;
}
