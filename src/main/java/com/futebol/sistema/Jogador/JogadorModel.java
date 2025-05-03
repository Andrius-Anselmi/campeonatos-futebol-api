package com.futebol.sistema.Jogador;

import com.futebol.sistema.Clube.ClubeModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "jogador_tb")
public class JogadorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "IDADE")
    private int idade;

    @Column(name = "NUMERO")
    private int numero;

    @Column(name = "ALTURA")
    private float altura;

    @Column(name = "NACIONALIDADE")
    private String nacionalidae;

    @Column(name = "SALARIO")
    private float salario;

    @Column(name = "POSICAO")
    private String posicao;


    @JoinColumn(name = "clube_id")
    @ManyToOne
    private ClubeModel clubes;





}
