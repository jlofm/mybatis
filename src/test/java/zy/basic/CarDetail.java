package zy.basic;/**
 * Created by Administrator on 2018/7/2.
 */

/**
 * @Author zyuan
 * @Date 2018/7/2 17:41
 * @Versioin v1.0
 **/
public class CarDetail {

    private Integer id;
    private String name;
    private String mode;
    private Integer carId;

    private Item item;

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

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "CarDetail{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mode='" + mode + '\'' +
                ", carId=" + carId +
                ", item=" + item +
                '}';
    }
}
