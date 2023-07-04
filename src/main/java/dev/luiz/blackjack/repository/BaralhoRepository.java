package dev.luiz.blackjack.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import dev.luiz.blackjack.model.Baralho;

@Repository
public interface BaralhoRepository extends MongoRepository<Baralho, String> {
    
}
