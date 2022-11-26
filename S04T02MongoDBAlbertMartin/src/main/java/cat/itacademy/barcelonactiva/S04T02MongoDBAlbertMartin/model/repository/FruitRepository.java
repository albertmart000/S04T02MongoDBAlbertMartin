package cat.itacademy.barcelonactiva.S04T02MongoDBAlbertMartin.model.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import cat.itacademy.barcelonactiva.S04T02MongoDBAlbertMartin.model.domain.Fruit;

@Repository
public interface FruitRepository extends MongoRepository<Fruit, Long> {

}