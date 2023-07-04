package dev.luiz.blackjack.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import dev.luiz.blackjack.model.Mao;

@Repository
public interface MaoRepository extends MongoRepository<Mao, String>{
    
}
