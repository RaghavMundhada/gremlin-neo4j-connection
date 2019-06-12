package gtest.dao.gremlin.nodes;

import com.microsoft.spring.data.gremlin.annotation.GeneratedValue;
import com.microsoft.spring.data.gremlin.annotation.Vertex;
import org.springframework.data.annotation.Id;

/**
 * Author: Dhruv Mahajan
 **/

@Vertex
public class Dish {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String entityId;

    private String version;

    public Dish() {
        // Empty constructor required as of Neo4j API 2.0.5
    }

    public static String nameToEntityId(String name) {
        return name.toLowerCase().replaceAll("[^a-z0-9]", "");
    }

    public Dish(String name, String version) {
        this.name = name;
        this.entityId = nameToEntityId(name);
        this.version = version;
    }

    public String toString() {
        return this.name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEntityId() {
        return entityId;
    }

    public String getVersion() {
        return version;
    }
}
