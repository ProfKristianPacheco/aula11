package com.example.aula11_crud.controller;

import com.example.aula11_crud.model.Aluno;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/alunos")
    public void adicionarAluno(@RequestBody Aluno aluno){
        alunos.add(aluno);
    }

    @PutMapping("/alunos")
    public void atualizarAluno(@RequestBody Aluno aluno){
        for(Aluno alunoAtual : alunos){
            if(alunoAtual.getId() == aluno.getId()){
                alunoAtual.setNome(aluno.getNome());
                alunoAtual.setMatricula(aluno.getMatricula());
                alunoAtual.setPresente(aluno.isPresente());
                return;
            }
        }
    }

    @DeleteMapping("/alunos/{id}")
    public void deletarAluno(@PathVariable int id){
        for(Aluno alunoAtual : alunos){
            if(alunoAtual.getId() == id){
                alunos.remove(alunoAtual);
                return;
            }
        }
    }

    @GetMapping("/alunos/pesquisar")
    public Aluno pesquisarAluno(@RequestParam String nome){
        for(Aluno alunoAtual : alunos){
            if(alunoAtual.getNome().equalsIgnoreCase(nome)){
                return alunoAtual;
            }
        }
        return null;
    }

}
