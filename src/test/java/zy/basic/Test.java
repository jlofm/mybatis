package zy.basic;/**
 * Created by Administrator on 2018/7/2.
 */

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;
import java.util.List;

/**
 * @Author zyuan
 * @Date 2018/7/2 15:45
 * @Versioin v1.0
 **/
public class Test {

    private static SqlSessionFactory sqlSessionFactory;

    public void setUp() throws Exception {
        // create a SqlSessionFactory
        Reader reader = null;
        try {
            //加载配置文件
            reader = Resources.getResourceAsReader("mybatis-config.xml");
            /**
             * 程序入口
             */
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            reader.close();
        }
    }

    /**
     * 包含一对一映射关系的查询测试
     */
    public void testQueryCars() {
        try {
            this.setUp();
        } catch (Exception e) {
            e.printStackTrace();
        }
        SqlSession sqlSession = sqlSessionFactory.openSession();
        /**
         * MyBatis会根据相应的接口声明的方法信息，通过动态代理机制生成一个
         * Mapper实例
         * 满足面向接口编程的需要
         * 此处的Mapper是一个jdk代理对象
         */
        CarMapper mapper = sqlSession.getMapper(CarMapper.class);
        // 此处调用mapper中对应的方法，会调用MapperProxy对象的invoke()方法
        List<Car> cars = mapper.getCars();
        System.out.println("查询结果：");
        System.out.println(cars);
        /**
         * 再次查询,中间没有执行增删改的操作，没有commit提交事务操作
         * 不会清空一级缓存，所以两次方法调用，执行一次查询方法
         * mybatis默认开启一级缓存,一级缓存是sqlSession级别的缓存
         */
        List<Car> secondCars = mapper.getCars();
        System.out.println("查询结果：");
        System.out.println(secondCars);

    }

    public void testQueryEngines() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        CarMapper mapper = sqlSession.getMapper(CarMapper.class);
        List<Engine> engines = mapper.getEngines();
    }

    /**
     * 包含一对多映射关系的查询测试
     * 一对多为主，还包括各种属性的一对一映射
     */
    public void testCarDetails() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        CarMapper mapper = sqlSession.getMapper(CarMapper.class);
        List<Car> carDetails = mapper.getCarDetails();
        System.out.println("查询结果：");
        System.out.println("carDetails size : " + carDetails.size());
        for (Car car : carDetails) {
            System.out.println("details size : " + car.getDetails().size());
            for (CarDetail detail : car.getDetails()) {
                System.out.println(detail);
            }
        }
//        System.out.println(carDetails);
    }

    /**
     * 多层循环嵌套，多表关联查询测试
     */
    public void testCustoms() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        CarMapper mapper = sqlSession.getMapper(CarMapper.class);
        List<Custom> customs = mapper.getCustom();
        System.out.println("查询结果：");
        System.out.println(customs);
    }

    /**
     * mybatis的基本demo
     * @param args
     */
    public static void main(String[] args) {
        Test test = new Test();
        test.testQueryCars();
    }



}
