package dev.luiz.blackjack.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import dev.luiz.blackjack.model.Jogador;

@Repository
public interface JogadorRepository extends MongoRepository<Jogador, String>{
    
}
