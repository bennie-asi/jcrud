package xyz._990904.Jcrud.annotation;

import java.lang.annotation.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bennie
 * @Date: 2024/03/16/20:42
 * @Description: 是否唯一;也可以通过@Column的isUnique属性设置
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Unique {
    /**
     * @return java.lang.String
     * @author
     * @date 2024/3/16 20:43
     * @description 字段唯一约束名称，不设置默认为{jcrud_uni_当前标记字段名@Column的name属性值}；如果设置了name属性值，则默认为{jcrud_uni_当前标记字段名name属性值}
     */
    String value() default "";

/**
     * @return java.lang.String[]
     * @description 可设置多个建立联合唯一{"login_mobile","login_name"}
     */
    String[] columns() default {};
}
