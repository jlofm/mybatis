package zy.basic;/**
 * Created by Administrator on 2018/7/2.
 */

/**
 * @Author zyuan
 * @Date 2018/7/2 15:00
 * @Versioin v1.0
 **/
public class Engine {

    private Integer id;
    private String type;
    private String name;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
