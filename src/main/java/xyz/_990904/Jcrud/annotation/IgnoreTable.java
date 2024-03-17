package xyz._990904.Jcrud.annotation;

import java.lang.annotation.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bennie
 * @Date: 2024/03/16/19:58
 * @Description: 忽略建表
 */
//表示注解加在接口、类、枚举等
@Target(ElementType.TYPE)
//VM将在运行期也保留注释，因此可以通过反射机制读取注解的信息
@Retention(RetentionPolicy.RUNTIME)
//将此注解包含在javadoc中
public @interface IgnoreTable {
}
