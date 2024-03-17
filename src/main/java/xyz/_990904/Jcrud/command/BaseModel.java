package xyz._990904.Jcrud.command;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.LinkedHashMap;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bennie
 * @Date: 2024/03/16/18:47
 * @Description: 分页的基本属性
 */
public class BaseModel implements Serializable {


    private static final long serialVersionUID = 1L;

    @Getter
    public int currentPage = 1;

    @Getter
    @Setter
    public int pageSize = 10;

    @Setter
    public int start;

    public static String DESC = "desc";

    public static String ASC = "asc";

    @Getter
    @Setter
    public LinkedHashMap<String, String> orderBy;

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
        this.setStart((currentPage - 1) * getPageSize());
    }


    public int getStart() {
        this.setStart((currentPage - 1) * getPageSize());
        return start;
    }
}
