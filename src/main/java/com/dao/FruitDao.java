package com.dao;

import com.entity.Fruit;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * Created by roy.zhuo on 2017/10/13.
 */
public interface FruitDao {


    int addFruit(Fruit fruit);

    int updateFruit(Fruit fruit);

    int deleteFruit(int id);

    Fruit queryFruit(int id);

    List<Fruit> queryFruits();

    /*用foreach标签进行p量查询*/
    List<Fruit> queryFruitsByIds1(List<Integer> ids);

    List<Fruit>  queryFruitsByIds2(Map<String,Object> ids);

    List<Fruit>  queryFruitsByIds3(int[] ids);

    //模糊查询
    List<Fruit> queryFruitsLike(Fruit fruit);



}
