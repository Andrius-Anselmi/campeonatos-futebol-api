package com.futebol.sistema.Jogador;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jogador")

public class JogadorController {

    @PostMapping("/criar")
    public String criarJogador() {

        return "Jogador criado";

    }

    @GetMapping("/exibir")
    public String ExibirJogadores() {

        return "Exibindo jogadores";
    }

    @GetMapping("/exibir/{id}")
    public String ExibirPorId() {
        return "Jogadores exibidos por ID";
    }

    @PutMapping("/alterar/{id}")
    public String alterarPorId() {

        return "Alterando jogador";
    }

    @DeleteMapping("/deletar/{id}")
    public String deletarPorId() {

        return "deletando";
    }

    }

