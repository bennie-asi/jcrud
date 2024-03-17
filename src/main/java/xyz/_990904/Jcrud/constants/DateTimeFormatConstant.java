package xyz._990904.Jcrud.constants;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bennie
 * @Date: 2024/03/16/19:54
 * @Description: 日期时间格式常量

 */
public class DateTimeFormatConstant {
    /**
     * 日期格式，精确到日期
     */
    public static final String DATE_DAY = "yyyyMMdd";
    /**
     * 日期格式，精确到月份
     */
    public static final String DATE_MONTH = "yyyyMM";
    /**
     * 日期格式，精确到年
     */
    public static final String DATE_YEAR = "yyyy";
    /**
     * 日期时间格式，精确到秒
     */
    public static final String DATE_TIME_SEC = "yyyyMMddHHmmss";
    /**
     * 日期时间格式，精确到分
     */
    public static final String DATE_TIME_MIN = "yyyyMMddHHmm";
    /**
     * 日期时间格式，精确到小时
     */
    public static final String DATE_TIME_HOUR = "yyyyMMddHH";

    private String pattern;

    DateTimeFormatConstant(String pattern) {
        this.pattern = pattern;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }
}
