package xyz._990904.Jcrud.annotation.Impl;

import xyz._990904.Jcrud.annotation.Column;
import xyz._990904.Jcrud.constants.MySqlTypeConstant;

import java.lang.annotation.Annotation;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bennie
 * @Date: 2024/03/16/18:58
 * @Description:
 */
public class ColumnImpl implements Column {

    /**
     * @return java.lang.String
     * @author
     * @date 2024/3/16 19:02
     * @description 字段名，类同javax.persistence.Column.name，不填默认使用属性名作为表字段名
     */
    @Override
    public String value() {
        return "";
    }

    /**
     * @return java.lang.String
     * @description 字段名，类同javax.persistence.Column.name，不填默认使用属性名作为表字段名
     */
    @Override
    public String name() {
        return "";
    }

    /**
     * @return xyz._9909094.Jcrud.constants.MySqlTypeConstant
     * @description 字段类型，不填默认使用属性的数据类型进行转换，转换失败的字段不会添加
     * 仅支持xyz._9909094.Jcrud.constants.MySqlTypeConstant中的枚举数据类型
     * 不填默认转换类：xyz._9909094.Jcrud.command.JavaToMysqlType
     * 也可以通过注解实现：xyz._9909094.Jcrud.annotation.ColumnType
     */
    @Override
    public MySqlTypeConstant type() {
        return MySqlTypeConstant.DEFAULT;
    }

    /**
     * @return int
     * @description 字段长度，默认是255，类型默认长度参考：xyz._9909094.Jcrud.constants.MySqlTypeConstant
     */
    @Override
    public int length() {
        return 0;
    }

    /**
     * @return int
     * @description 小数点长度，默认是0，类型默认长度参考：xyz._9909094.Jcrud.constants.MySqlTypeConstant
     */
    @Override
    public int decimalLength() {
        return 0;
    }

    /**
     * @return boolean
     * @description 是否可以为null，默认为true
     * 也可以通过注解实现：xyz._9909094.Jcrud.annotation.NotNull
     */
    @Override
    public boolean isNull() {
        return false;
    }

    /**
     * @return boolean
     * @description 是否为主键，默认为false
     */
    @Override
    public boolean isKey() {
        return false;
    }

    /**
     * @return boolean
     * @description 是否为自增，默认为false
     */
    @Override
    public boolean isAutoIncrement() {
        return false;
    }

    /**
     * @return boolean
     * @description 是否为唯一，默认为false
     */
    @Override
    public boolean isUnique() {
        return false;
    }

    /**
     * @return java.lang.String
     * @description 字段注释，默认为空
     */
    @Override
    public String comment() {
        return "";
    }

    /**
     * @return java.lang.String
     * @description 默认值，默认为空
     */
    @Override
    public String defaultValue() {
        return "";
    }

    /**
     * Returns the annotation type of this annotation.
     *
     * @return the annotation type of this annotation
     */
    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
