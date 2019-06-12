package gtest.dao.gremlin.nodes;

import com.microsoft.spring.data.gremlin.annotation.GeneratedValue;
import com.microsoft.spring.data.gremlin.annotation.Vertex;
import org.springframework.data.annotation.Id;

/**
 * Author: Dhruv Mahajan
 **/

@Vertex
public class Item {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String entityId;

    public Item() {
        // Empty constructor required as of Neo4j API 2.0.5
    }

    /**
     * Neo4j doesn't REALLY have bi-directional relationships. It just means when querying
     * to ignore the direction of the relationship.
     * https://dzone.com/articles/modelling-data-neo4j
     */

    public String toString() {
        return this.name;
    }
}
