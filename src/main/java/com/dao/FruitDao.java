package com.dao;

import com.entity.Fruit;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by roy.zhuo on 2017/10/13.
 */
public interface FruitDao {


    int addFruit(Fruit fruit);

    int updateFruit(Fruit fruit);

    int deleteFruit(int id);

    Fruit queryFruit(int id);

    List<Fruit> queryFruits();


}
