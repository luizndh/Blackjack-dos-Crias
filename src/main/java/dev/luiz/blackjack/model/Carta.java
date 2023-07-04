package dev.luiz.blackjack.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "Carta")
public class Carta {
    
    @Id
    private String id;
    private String naipe;
    private String valor;

}
