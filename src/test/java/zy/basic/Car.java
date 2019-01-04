package zy.basic;/**
 * Created by Administrator on 2018/7/2.
 */

import java.util.List;

/**
 * @Author zyuan
 * @Date 2018/7/2 14:59
 * @Versioin v1.0
 **/
public class Car {

    private int id;
    private String type;
    // 一对一映射
    private Engine engineId;
    private String brakestype;

    private List<CarDetail> details;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Engine getEngineId() {
        return engineId;
    }

    public void setEngineId(Engine engineId) {
        this.engineId = engineId;
    }

    public String getBrakestype() {
        return brakestype;
    }

    public void setBrakestype(String brakestype) {
        this.brakestype = brakestype;
    }

    public List<CarDetail> getDetails() {
        return details;
    }

    public void setDetails(List<CarDetail> details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", engineId=" + engineId +
                ", brakestype='" + brakestype + '\'' +
                ", details=" + details +
                '}';
    }
}
