package xyz._990904.Jcrud.annotation;

import java.lang.annotation.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bennie
 * @Date: 2024/03/16/19:52
 * @Description:
 */
@Target(ElementType.FIELD)
// VM将在运行期也保留注释，因此可以通过反射机制读取注解的信息
@Retention(RetentionPolicy.RUNTIME)
// 将此注解包含在javadoc中
@Documented
public @interface DefaultValue {
/**
     * @return java.lang.String
     * @description 默认值
     */
    String value() default "";


}
