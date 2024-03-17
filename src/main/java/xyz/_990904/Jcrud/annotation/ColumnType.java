package xyz._990904.Jcrud.annotation;

import xyz._990904.Jcrud.constants.MySqlTypeConstant;

import java.lang.annotation.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bennie
 * @Date: 2024/03/16/19:51
 * @Description:
 */
@Target(ElementType.FIELD)
// VM将在运行期也保留注释，因此可以通过反射机制读取注解的信息
@Retention(RetentionPolicy.RUNTIME)
// 将此注解包含在javadoc中
@Documented
public @interface ColumnType {
    /**
     * @return xyz._990904.Jcrud.constants.MySqlTypeConstant
     * @author
     * @date 2024/3/16 19:51
     * @description 字段类型，仅支持xyz._990904.Jcrud.constants.MySqlTypeConstant中的枚举数据类型
     */
    MySqlTypeConstant value() default MySqlTypeConstant.DEFAULT;

    /**
     * @return int
     * @description 字段长度，默认是255
     */
    int length() default 255;

    /**
     * @return int
     * @description 小数点长度，默认是0
     */
    int decimalLength() default 0;
}
