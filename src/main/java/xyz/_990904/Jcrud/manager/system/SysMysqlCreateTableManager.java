package xyz._990904.Jcrud.manager.system;


import java.util.List;

/**
 *
 * @author sunchenbin
 * @version 2016年6月23日 下午6:07:21
 */
public interface SysMysqlCreateTableManager {

	public void createMysqlTable();

	public List<Object> getAllFields(Class<?> clas);

}
