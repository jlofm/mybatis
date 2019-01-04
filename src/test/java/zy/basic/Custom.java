package zy.basic;/**
 * Created by Administrator on 2018/7/4.
 */

import java.util.List;

/**
 * @Author zyuan
 * @Date 2018/7/4 9:48
 * @Versioin v1.0
 **/
public class Custom {

    private Integer id;
    private String name;
    private String address;

    private List<Car> cars;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "Custom{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", cars=" + cars +
                '}';
    }
}
