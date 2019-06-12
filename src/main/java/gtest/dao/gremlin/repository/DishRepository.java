package gtest.dao.gremlin.repository;

import com.microsoft.spring.data.gremlin.repository.GremlinRepository;
import gtest.dao.gremlin.nodes.Dish;
import org.springframework.stereotype.Repository;

/**
 * Author: Dhruv Mahajan
 **/
@Repository
public interface DishRepository extends GremlinRepository<Dish, Long> {
//   List<Dish> findByEntityId(String entityId);
//    List<Dish> findAllByVersion(String version);
//    List<Dish> findByEntityIdAndVersion(String entityId, String Version);

}
