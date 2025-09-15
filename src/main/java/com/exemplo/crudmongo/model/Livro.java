package com.exemplo.crudmongo.model;

import java.time.LocalDate;

public class Livro {
private String idLivro;
private String tituloLivro;
private String autorLivro;
private LocalDate anoPublicacao;
private int numeroPaginas;
private String generoLivro;
private int estoqueLivro;
// getters and setters
public String getidLivro() {
    return idLivro;
}
public void setidLivro(String idLivro) {
    this.idLivro = idLivro;
}

public String getTituloLivro() {
    return tituloLivro;
}
public void setTituloLivro(String tituloLivro) {
    this.tituloLivro = tituloLivro;
}

public String getAutorLivro() {
    return autorLivro;
}
public void setAutorLivro(String autorLivro) {
    this.autorLivro = autorLivro;
}

public LocalDate getanoPublicacao() {
    return anoPublicacao;
}
public void setAnoPublicacao(LocalDate anoPublicacao) {
    this.anoPublicacao = anoPublicacao;
}

public int getNumeroPaginas() {
    return numeroPaginas;
}
public void setNumeroPaginas(int numeroPaginas) {
    this.numeroPaginas = numeroPaginas;
}

public String getGeneroLivro() {
    return generoLivro;
}
public void setGeneroLivro(String generoLivro) {
    this.generoLivro = generoLivro;
}

public int getEstoqueLivro() {
    return estoqueLivro;
}

public void setEstoqueLivro(int estoqueLivro) {
    this.estoqueLivro = estoqueLivro;
}
}