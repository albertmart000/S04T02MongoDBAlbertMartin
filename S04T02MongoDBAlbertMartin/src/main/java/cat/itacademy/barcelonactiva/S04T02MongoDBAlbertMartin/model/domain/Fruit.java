package cat.itacademy.barcelonactiva.S04T02MongoDBAlbertMartin.model.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "fruits")
public class Fruit {

    @Id
    private Long id;
    private String name;
    private double numberOfKilos;

    public Fruit() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNumberOfKilos() {
        return numberOfKilos;
    }

    public void setNumberOfKilos(double numberOfKilos) {
        this.numberOfKilos = numberOfKilos;
    }
}