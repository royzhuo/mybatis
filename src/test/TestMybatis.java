import com.dao.FruitDao;
import com.entity.Fruit;
import com.service.FruitService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import javax.management.Query;
import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.*;

/**
 * Created by roy.zhuo on 2017/10/13.
 */

@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration( {"classpath:spring.xml"})
public class TestMybatis {
    @Autowired
    private DataSource dataSource;

    @Resource
    private FruitService fruitService;



    @Test
    public void testDataSource(){
        System.out.println("数据源:"+dataSource);

        try {
            System.out.println("数据源链接:"+dataSource.getConnection());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testFruitAdd(){

        Fruit fruit=new Fruit("荔枝",22.31,"福建",new Date());
        int result=fruitService.addFruit(fruit);
        junit.framework.Assert.assertEquals(result,1);
        System.out.println("水果:"+fruit.toString());
    }

    @Test
    public void testFruitUpdate(){

        Fruit fruit=new Fruit();
        fruit.setName("哈密瓜");
        fruit.setId(2);
        fruit.setPrice(35);
        fruit.setUpdateTime(new Date());
        int result=fruitService.updateFruit(fruit);
        junit.framework.Assert.assertEquals(result,1);
    }

    @Test
    public void testFruitDelete(){
        int result=fruitService.deleteFruit(5);
        junit.framework.Assert.assertEquals(result,1);
    }

    @Test
    public void testFruitQuery(){
        Fruit fruit=fruitService.queryFruit(2);
        System.out.println(fruit.toString());
    }

    @Test
    public void testFruitsQuery(){
        List<Fruit> fruits=fruitService.queryFruits();
        for (Fruit fruit:fruits) {
            System.out.println(fruit.toString());
        }
    }

    @Test
    public void testFruitsQueryList(){
        List<Integer> ids=new ArrayList<>();
        ids.add(1);
        ids.add(4);
        ids.add(3);
        ids.add(5);
        List<Fruit> fruits=fruitService.queryFruits(ids);
        for (Fruit fruit:fruits) {
            System.out.println(fruit.toString());
        }
    }

    @Test
    public void testFruitsQueryArray(){
        int[] ids={1,4,3,5};
        List<Fruit> fruits=fruitService.queryFruits(ids);
        for (Fruit fruit:fruits) {
            System.out.println(fruit.toString());
        }
    }
    @Test
    public void testFruitsQueryMap(){
        Map<String ,Object> map=new HashMap<>();
        List<Integer> ids=new ArrayList<>();
        ids.add(1);
        ids.add(4);
        ids.add(3);
        ids.add(5);
        map.put("ids",ids);
        map.put("title","hashmap 查询");
        List<Fruit> fruits=fruitService.queryFruits(map);
        for (Fruit fruit:fruits) {
            System.out.println(fruit.toString());
        }
    }

    @Test
    public void testQueryFruitsLike(){
        Fruit fruit=new Fruit();
        fruit.setAddress("%鲁%");
        fruit.setName("%龙%");
        List<Fruit> fruits=fruitService.queryFruitsLike(fruit);
        for (Fruit fruit1:fruits) {
            System.out.println(fruit1.toString());
        }
    }

    @Test
    public void testQueryOfManyParams(){

//    1.    Fruit fruit=fruitService.queryFruitByNameAndId(7,"火龙果");
        //2.
//        Map<String,Object> params=new HashMap<>();
//        params.put("id",7);
//        params.put("name","火龙果");
        //3.
        List<Object> params=new ArrayList<>();
        params.add(7);
        params.add("火龙果");
        Fruit fruit=fruitService.queryFruitByNameAndId(params);
        System.out.println(fruit.toString());

    }




}
