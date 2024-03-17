package xyz._990904.Jcrud.annotation;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bennie
 * @Date: 2024/03/16/19:59
 * @Description: 忽略字段更新
 */
public @interface IgnoreUpdate {
        // 是否忽略对当前字段的更新操作
    boolean value() default true;
}
