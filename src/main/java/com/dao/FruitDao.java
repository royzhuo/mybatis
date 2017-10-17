package com.dao;

import com.entity.Fruit;
import org.apache.ibatis.annotations.Param;
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

    //传单个参数
    Fruit queryFruit(int id);

    //传多个参数
//    Fruit queryFruitByNameAndId(int id,String name);

    Fruit queryFruitByNameAndId(@Param("id") int id, @Param("name") String name);

    Fruit queryFruitByNameAndId(Map<String,Object> params);
    Fruit queryFruitByNameAndId(List<Object> params);

    List<Fruit> queryFruits();

    /*用foreach标签进行p量查询*/
    List<Fruit> queryFruitsByIds1(List<Integer> ids);

    List<Fruit>  queryFruitsByIds2(Map<String,Object> ids);

    List<Fruit>  queryFruitsByIds3(int[] ids);

    //模糊查询
    List<Fruit> queryFruitsLike(Fruit fruit);




}
