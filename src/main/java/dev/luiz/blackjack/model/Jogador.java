package dev.luiz.blackjack.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "Jogador")
public class Jogador {
    
}
