package com.exemplo.crudmongo.model;

import java.time.LocalDate;

public class Emprestimo {
private String idEmprestimo;
private int matriculaAluno;
private int idLivro;
private LocalDate dataRetirada;
private LocalDate dataDevolucao;
private float multaEmprestimo;

public String getIdEmprestimo() {
    return idEmprestimo;
}

public void setIdEmprestimo(String idEmprestimo) {
    this.idEmprestimo = idEmprestimo;
}

public int getMatriculaAluno() {
    return matriculaAluno;
}
public void setMatriculaAluno(int matriculaAluno) {
    this.matriculaAluno = matriculaAluno;
}

public int getIdLivro() {
    return idLivro;
}
public void setIdLivro(int idLivro) {
    this.idLivro = idLivro;
}

public LocalDate getDataRetirada() {
    return dataRetirada;
}
public void setDataRetirada(LocalDate dataRetirada) {
    this.dataRetirada = dataRetirada;
}

public LocalDate getDataDevolucao() {
    return dataDevolucao;
}
public void setDataDevolucao(LocalDate dataDevolucao) {
    this.dataDevolucao = dataDevolucao;
}

public float getMultaEmprestimo() {
    return multaEmprestimo;
}
public void setMultaEmprestimo(float multaEmprestimo) {
    this.multaEmprestimo = multaEmprestimo;
}
}
