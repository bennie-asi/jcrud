package xyz._990904.Jcrud.annotation;

import xyz._990904.Jcrud.constants.DateTimeFormatConstant;

import java.lang.annotation.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bennie
 * @Date: 2024/03/16/19:56
 * @Description: 表名时间后缀
 */
//表示注解加在接口、类、枚举等
@Target(ElementType.TYPE)
//VM将在运行期也保留注释，因此可以通过反射机制读取注解的信息
@Retention(RetentionPolicy.RUNTIME)
//将此注解包含在javadoc中
@Documented
public @interface EnableTimeSuffix {
        /**
     * 开启时间后缀
     * @return
     */
    boolean value() default true;

    /**
     * 时间后缀格式
     * <br> 使用常量类 {@link DateTimeFormatConstant}
     * @return
     */
    String pattern() default DateTimeFormatConstant.DATE_MONTH;
}
