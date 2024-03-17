package xyz._990904.Jcrud.command;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bennie
 * @Date: 2024/03/16/18:54
 * @Description:
 */
@AllArgsConstructor
public class SaveOrUpdateDataCommand {
    private Long id;
    private Map<Object, Map<Object, Object>> tableMap;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Map<Object, Map<Object, Object>> getTableMap() {
        return tableMap;
    }

    public void setTableMap(Map<Object, Map<Object, Object>> tableMap) {
        this.tableMap = tableMap;
    }

    public SaveOrUpdateDataCommand(Map<Object, Map<Object, Object>> tableMap) {
        this.tableMap = tableMap;
    }
}
