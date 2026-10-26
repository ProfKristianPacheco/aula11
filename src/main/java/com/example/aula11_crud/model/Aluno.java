package com.example.aula11_crud.model;

public class Aluno {
    private int id;
    private String nome;
    private String matricula;
    private boolean presente;

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                ", presente=" + presente +
                '}';
    }

    public Aluno(int id, String nome, String matricula, boolean presente) {
        this.id = id;
        this.nome = nome;
        this.matricula = matricula;
        this.presente = presente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public boolean isPresente() {
        return presente;
    }

    public void setPresente(boolean presente) {
        this.presente = presente;
    }
}
