package zy.basic;/**
 * Created by Administrator on 2018/7/4.
 */

/**
 * @Author zyuan
 * @Date 2018/7/4 9:49
 * @Versioin v1.0
 **/
public class Item {

    private Integer id;
    private String name;
    private String code;
    private String detail;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", detail='" + detail + '\'' +
                '}';
    }
}
