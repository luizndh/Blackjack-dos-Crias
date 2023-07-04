package dev.luiz.blackjack.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import dev.luiz.blackjack.model.Carta;

@Repository
public interface CartaRepository extends MongoRepository<Carta, String>{
    
}
