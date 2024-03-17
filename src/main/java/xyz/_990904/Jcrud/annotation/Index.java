package xyz._990904.Jcrud.annotation;

import java.lang.annotation.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bennie
 * @Date: 2024/03/16/20:00
 * @Description:
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Index {
    /**
     * @return java.lang.String
     * @author
     * @date 2024/3/16 20:01
     * @description 索引名，不设默认为{jcrud_idx_当前标记字段名@Column的name},如果设置了value则使用{jcrud_idx_当前标记字段名@value}
     */
    String value() default "";

    /**
     * @return java.lang.String[]
     * @description 要建立索引的字段名，不设置默认为当前标记字段名@Column的name;可设置多个建立联合索引{"login_mobile","login_name"};
     */
    String[] columns() default {};

}
