package xyz._990904.Jcrud.annotation;

import xyz._990904.Jcrud.constants.MySqlCharsetConstant;

import java.lang.annotation.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bennie
 * @Date: 2024/03/16/20:39
 * @Description: 表字符集,也可以使用@TableCharset注解代替
 */
@Target(ElementType.TYPE)
//VM将在运行期也保留注释，因此可以通过反射机制读取注解的信息
@Retention(RetentionPolicy.RUNTIME)
//将此注解包含在javadoc中
@Documented
public @interface TableCharset {
    /**
     * 表字符集
     * 仅支持xyz._9909094.Jcrud.constants.MySqlCharsetConstant中的枚举数据类型
     *
     * @return 表字符集
     */
    MySqlCharsetConstant value() default MySqlCharsetConstant.DEFAULT;
}
