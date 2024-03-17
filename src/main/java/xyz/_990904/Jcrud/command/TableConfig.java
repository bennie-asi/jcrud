package xyz._990904.Jcrud.command;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bennie
 * @Date: 2024/03/16/18:39
 * @Description:
 */
@AllArgsConstructor
public class TableConfig {
    private List<Object> list = new ArrayList<Object>();
    private Map<String, Object> map = new HashMap<String, Object>();

    public TableConfig(List<Object> list) {
        if (list != null) {
            this.list = list;
        }
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public TableConfig(Map<String, Object> map) {
        this.map = map;
    }
}
