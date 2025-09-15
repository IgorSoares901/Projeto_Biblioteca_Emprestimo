package com.exemplo.crudmongo.model;
public class Aluno {
private String matriculaAluno;
private String nomeAluno;
private String cursoAluno;
private String emailAluno;
private String telefoneAluno;

// getters and setters
public String getMatriculaAluno() {
    return matriculaAluno;
}
public void setMatriculaAluno(String matriculaAluno) {
    this.matriculaAluno = matriculaAluno;
}

public String getNomeAluno() {
    return nomeAluno;
}
public void setNomeAluno(String nomeAluno) {
    this.nomeAluno = nomeAluno;
}

public String getCursoAluno() {
    return cursoAluno;
}
public void setCursoAluno(String cursoAluno) {
    this.cursoAluno = cursoAluno;
}

public String getEmailAluno() {
    return emailAluno;
}
public void setEmailAluno(String emailAluno) {
    this.emailAluno = emailAluno;
}

public String getTelefoneAluno() {
    return telefoneAluno;
}
public void setTelefoneAluno(String telefoneAluno) {
    this.telefoneAluno = telefoneAluno;
}
}