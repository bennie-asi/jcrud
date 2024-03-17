package xyz._990904.Jcrud.annotation;

import org.springframework.core.annotation.AliasFor;
import xyz._990904.Jcrud.constants.MySqlTypeConstant;
import xyz._990904.Jcrud.utils.ColumnUtils;

import java.lang.annotation.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bennie
 * @Date: 2024/03/15/16:50
 * @Description: 用于声明字段
 */
// 该注解用于方法声明
@Target(ElementType.FIELD)
// VM将在运行期也保留注释，因此可以通过反射机制读取注解的信息
@Retention(RetentionPolicy.RUNTIME)
// 将此注解包含在javadoc中
@Documented
public @interface Column {
    /**
     * @return java.lang.String
     * @author
     * @date 2024/3/16 19:02
     * @description 字段名，类同javax.persistence.Column.name，不填默认使用属性名作为表字段名
     */
    @AliasFor("name")
    String value() default "";

    /**
     * @return java.lang.String
     * @description 字段名，类同javax.persistence.Column.name，不填默认使用属性名作为表字段名
     */
    @AliasFor("value")
    String name() default "";

    /**
     * @return xyz._9909094.Jcrud.constants.MySqlTypeConstant
     * @description 字段类型，不填默认使用属性的数据类型进行转换，转换失败的字段不会添加
     * 仅支持xyz._9909094.Jcrud.constants.MySqlTypeConstant中的枚举数据类型
     * 不填默认转换类：xyz._9909094.Jcrud.command.JavaToMysqlType
     * 也可以通过注解实现：xyz._9909094.Jcrud.annotation.ColumnType
     */
    MySqlTypeConstant type() default MySqlTypeConstant.DEFAULT;

    /**
     * @return int
     * @description 字段长度，默认是255，类型默认长度参考：xyz._9909094.Jcrud.constants.MySqlTypeConstant
     */
    int length() default 255;

    /**
     * @return int
     * @description 小数点长度，默认是0，类型默认长度参考：xyz._9909094.Jcrud.constants.MySqlTypeConstant
     */
    int decimalLength() default 0;

    /**
     * @return boolean
     * @description 是否可以为null，默认为true
     * 也可以通过注解实现：xyz._9909094.Jcrud.annotation.NotNull
     */
    boolean isNull() default true;

    /**
     * @return boolean
     * @description 是否为主键，默认为false
     */
    boolean isKey() default false;

    /**
     * @return boolean
     * @description 是否为自增，默认为false
     */
    boolean isAutoIncrement() default false;

    /**
     * @return boolean
     * @description 是否为唯一，默认为false
     */
    boolean isUnique() default false;

    /**
     * @return java.lang.String
     * @description 字段注释，默认为空
     */
    String comment() default "";

    /**
     * @return java.lang.String
     * @description 默认值，默认为空
     */
    String defaultValue() default ColumnUtils.DEFAULTVALUE;
}
