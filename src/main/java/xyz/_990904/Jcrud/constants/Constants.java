package xyz._990904.Jcrud.constants;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bennie
 * @Date: 2024/03/16/20:46
 * @Description:
 */
public class Constants {

	public static final String DATABASE_TYPE_KEY 				= "mybatis.database.type";
	public static final String MODEL_PACK_KEY 					= "mybatis.model.pack";
	public static final String TABLE_AUTO_KEY 					= "mybatis.table.auto";

	public static final String DATABASE_TYPE_KEY_VALUE 			= "${mybatis.database.type:NULL}";
	public static final String MODEL_PACK_KEY_VALUE 			= "${mybatis.model.pack:NULL}";
	public static final String TABLE_AUTO_KEY_VALUE 			= "${mybatis.table.auto:NULL}";

	public static final String JCRUD_DATABASE_TYPE_KEY 		= "jcrud.database.type";
	public static final String JCRUD_MODEL_PACK_KEY 			= "jcrud.model.pack";
	public static final String JCRUD_TABLE_AUTO_KEY 			= "jcrud.table.auto";

	public static final String JCRUD_DATABASE_TYPE_KEY_VALUE 	= "${jcrud.database.type:NULL}";
	public static final String JCRUD_MODEL_PACK_KEY_VALUE 	= "${jcrud.model.pack:NULL}";
	public static final String JCRUD_TABLE_AUTO_KEY_VALUE 	= "${jcrud.table.auto:NULL}";

	public static final String NULL 							= "NULL";

	public static final String NEW_TABLE_MAP					= "newTableMap";
	public static final String MODIFY_TABLE_MAP					= "modifyTableMap";
	public static final String ADD_TABLE_MAP					= "addTableMap";
	public static final String REMOVE_TABLE_MAP					= "removeTableMap";
	public static final String MODIFY_TABLE_PROPERTY_MAP 		= "modifyTablePropertyMap";
	public static final String DROPKEY_TABLE_MAP				= "dropKeyTableMap";
	public static final String DROPINDEXANDUNIQUE_TABLE_MAP		= "dropIndexAndUniqueTableMap";
	public static final String ADDINDEX_TABLE_MAP				= "addIndexTableMap";
	public static final String ADDUNIQUE_TABLE_MAP				= "addUniqueTableMap";

	public static final String TABLE_INDEX_KEY 					= "jcrud.index.prefix";
	public static final String TABLE_UNIQUE_KEY 				= "jcrud.unique.prefix";

	public static final String TABLE_INDEX_KEY_VALUE 			= "${jcrud.index.prefix:jcrud_idx_}";
	public static final String TABLE_UNIQUE_KEY_VALUE 			= "${jcrud.unique.prefix:jcrud_uni_}";
}
