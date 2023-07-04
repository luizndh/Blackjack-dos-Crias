package dev.luiz.blackjack.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "Mao")
public class Mao {

    @Id
    private String id;
    private String nomeJogador;
    private String nomeCroupier;
    private Integer numCartas;

    @DBRef
    private List<Carta> cartas;
    
}
