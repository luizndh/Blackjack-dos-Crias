package dev.luiz.blackjack.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import dev.luiz.blackjack.model.Croupier;

@Repository
public interface CroupierRepository extends MongoRepository<Croupier, String>{
    
}
