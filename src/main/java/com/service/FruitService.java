package com.service;

import com.dao.FruitDao;
import com.entity.Fruit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by roy.zhuo on 2017/10/13.
 */

@Service
public class FruitService {

    @Autowired
    private FruitDao fruitDao;

    public int addFruit(Fruit fruit){
        return fruitDao.addFruit(fruit);
    }

    public int updateFruit(Fruit fruit){
        return fruitDao.updateFruit(fruit);
    }

    public int deleteFruit(int id){
        return fruitDao.deleteFruit(id);
    }

    public Fruit queryFruit(int id){
        return fruitDao.queryFruit(id);
    }

    public List<Fruit> queryFruits(){
        return fruitDao.queryFruits();
    }
}
