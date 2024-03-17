package xyz._990904.Jcrud.annotation;

import xyz._990904.Jcrud.constants.MySqlEngineConstant;

import java.lang.annotation.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bennie
 * @Date: 2024/03/16/20:41
 * @Description: 表引擎，也可以使用@Comment中的engine属性代替
 */
@Target(ElementType.TYPE)
//VM将在运行期也保留注释，因此可以通过反射机制读取注解的信息
@Retention(RetentionPolicy.RUNTIME)
//将此注解包含在javadoc中
@Documented
public @interface TableEngine {

        /**
        * 表引擎
        * 仅支持xyz._990904.Jcrud.constants.MySqlEngineConstant中的枚举数据类型
        *
        * @return 表引擎
        */
        MySqlEngineConstant value();
}
