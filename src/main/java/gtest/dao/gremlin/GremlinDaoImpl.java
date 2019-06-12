package gtest.dao.gremlin;

import gtest.dao.DAO;
import gtest.dao.gremlin.nodes.Dish;
import gtest.dao.gremlin.repository.DishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GremlinDaoImpl implements DAO {
    @Autowired
    DishRepository dishRepository;

    public void test(){
        if(dishRepository == null){
            System.out.println("it's NUll");
        }
        Dish dish = new Dish("egg", "v0");
        dishRepository.save(dish);
    }
}
