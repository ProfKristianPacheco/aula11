package com.example.aula11_crud.controller;

import com.example.aula11_crud.model.Aluno;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
public class AlunoController {
    List<Aluno> alunos = new ArrayList<>();
    public AlunoController() {
        alunos.add(new Aluno(1, "José", "1234", true));
        alunos.add(new Aluno(2, "Maria", "2345", false));
    }

    @GetMapping("/alunos")
    public List<Aluno> obterAlunos(){
        return alunos;
    }

}
