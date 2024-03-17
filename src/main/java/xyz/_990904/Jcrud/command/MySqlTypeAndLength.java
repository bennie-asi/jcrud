package xyz._990904.Jcrud.command;

import lombok.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bennie
 * @Date: 2024/03/15/17:03
 * @Description:
 */
@AllArgsConstructor
@NoArgsConstructor
public class MySqlTypeAndLength {
    private Integer lengthCount;
    private Integer length;
    private Integer decimalLength;
    private String type;

    public Integer getLengthCount() {
        return lengthCount;
    }

    public void setLengthCount(Integer lengthCount) {
        this.lengthCount = lengthCount;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getDecimalLength() {
        return decimalLength;
    }

    public void setDecimalLength(Integer decimalLength) {
        this.decimalLength = decimalLength;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
