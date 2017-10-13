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
import java.util.Date;
import java.util.List;

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

        Fruit fruit=new Fruit("葡萄",12.31,"吐鲁番",new Date());
        int result=fruitService.addFruit(fruit);
        junit.framework.Assert.assertEquals(result,1);
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


}
