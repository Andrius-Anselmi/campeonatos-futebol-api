package com.futebol.sistema.Clube;

import com.futebol.sistema.Jogador.JogadorModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "clube_tb")
public class ClubeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NOME")
    private String nome_clube;

    @Column(name = "FUNDAÇÃO")
    private int ano_fundado;

    @Column(name = "VALOR DO CLUBE")
    private float valor_do_clube;

    @OneToMany(mappedBy = "clubes")
    private List<JogadorModel> jogadores;




}
