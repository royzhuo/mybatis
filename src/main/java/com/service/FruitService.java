package com.service;

import com.dao.FruitDao;
import com.entity.Fruit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by roy.zhuo on 2017/10/13.
 */

@Service
public class FruitService {

    @Autowired
    private FruitDao fruitDao;

    public int addFruit(Fruit fruit) {
        return fruitDao.addFruit(fruit);
    }

    public int updateFruit(Fruit fruit) {
        return fruitDao.updateFruit(fruit);
    }

    public int deleteFruit(int id) {
        return fruitDao.deleteFruit(id);
    }

    public Fruit queryFruit(int id) {
        return fruitDao.queryFruit(id);
    }

    public List<Fruit> queryFruits() {
        return fruitDao.queryFruits();
    }

    /*
    * p量查询
    * */

    public List<Fruit> queryFruits(List<Integer> ids) {
        return fruitDao.queryFruitsByIds1(ids);
    }

    public List<Fruit> queryFruits(int[] ids) {
        return fruitDao.queryFruitsByIds3(ids);
    }

    public List<Fruit> queryFruits(Map<String,Object> ids) {

        return fruitDao.queryFruitsByIds2(ids);
    }

    public List<Fruit> queryFruitsLike(Fruit fruit){
        return fruitDao.queryFruitsLike(fruit);
    }

    public List<Fruit> queryFruitsLike1(Fruit fruit){
        return fruitDao.queryFruitsLike1(fruit);
    }

    public Fruit queryFruitByNameAndId(Integer id,String name){
        return fruitDao.queryFruitByNameAndId(id,name);
    }

    public Fruit queryFruitByNameAndId(Map<String,Object> params){
        return fruitDao.queryFruitByNameAndId(params);
    }

    public Fruit queryFruitByNameAndId(List<Object> params){
        return fruitDao.queryFruitByNameAndId(params);
    }
}
