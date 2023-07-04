package dev.luiz.blackjack.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "Baralho")
public class Baralho {

    @Id
    private String id;

    @DBRef
    private List<Carta> cartas;
    
}
