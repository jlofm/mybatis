package zy.basic;

import java.util.List;

/**
 * Created by Administrator on 2018/7/2.
 */
public interface CarMapper {

    List<Car> getCars();

    List<Engine> getEngines();

    List<Car> getCarDetails();

    List<Custom> getCustom();



}
