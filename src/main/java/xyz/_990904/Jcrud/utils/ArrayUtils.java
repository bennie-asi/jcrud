package xyz._990904.Jcrud.utils;

import java.lang.reflect.Array;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bennie
 * @Date: 2024/03/16/21:09
 * @Description:
 */
public class ArrayUtils {
    	public static Object[] addAll(Object[] array1, Object[] array2) {
        if (array1 == null) {
            return array2.clone();
        } else if (array2 == null) {
            return array1.clone();
        }
        Object[] joinedArray = (Object[]) Array.newInstance(array1.getClass().getComponentType(),
                                                            array1.length + array2.length);
        System.arraycopy(array1, 0, joinedArray, 0, array1.length);
        System.arraycopy(array2, 0, joinedArray, array1.length, array2.length);
        return joinedArray;
    }
}
