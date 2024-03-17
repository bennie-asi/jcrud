package xyz._990904.Jcrud.annotation;

import java.lang.annotation.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bennie
 * @Date: 2024/03/16/20:34
 * @Description: 标志该字段不允许为空;也可以通过@Column的isNotNull属性设置
 */
@Target(ElementType.FIELD)
// VM将在运行期也保留注释，因此可以通过反射机制读取注解的信息
@Retention(RetentionPolicy.RUNTIME)
// 将此注解包含在javadoc中
@Documented
public @interface IsNotNull {
}

