package com.futebol.sistema.Clube;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clube")
public class ClubeController {

    @GetMapping("/criar")
    public String criarClube() {

        return "clube criado";
    }

    @GetMapping("/exibir")
    public String exibirClube() {

        return "exibindo clubes";
    }

    @GetMapping("/exibir/{id}")
    public String exibirClubePorId() {

        return "exibindo clube por id";
    }

    @PutMapping("/alterar")
    public String alterar() {

        return "clube alterado";
    }

    @DeleteMapping("/deletar{id}")
    public String deletarPorId() {

        return "clube deletado";
    }



}
