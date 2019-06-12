package gtest.dao.gremlin.relationships;

import com.microsoft.spring.data.gremlin.annotation.Edge;
import com.microsoft.spring.data.gremlin.annotation.EdgeFrom;
import com.microsoft.spring.data.gremlin.annotation.EdgeTo;
import com.microsoft.spring.data.gremlin.annotation.GeneratedValue;
import gtest.dao.gremlin.nodes.Item;
import gtest.dao.gremlin.nodes.Dish;
import org.springframework.data.annotation.Id;

/**
 * Author: Dhruv Mahajan
 **/

@Edge(label = "DISH__ITEM")
public class DishItemRelation {
    @Id
    @GeneratedValue
    private Long relationshipId;

    private String title;

    private Double confidence;

    private String version;

    @EdgeFrom
    private Dish dish;

    @EdgeTo
    private Item item;

    public DishItemRelation() {
    }

    public String toString() {
        return this.title;
    }
}
