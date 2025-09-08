package com.exemplo.crudmongo.controller;

public class LivroController {
private final LivroService service;
public LivroController(LivroService service) {
    this.service = service;
}

public List<Livro> Listar() {
    return service.ListarTodos();
}

public Livro criar(@RequestBody Livro livro) {
    return service.salvar(livro);
}

public Livro atualizar(@PathVariable int idLivro, @RequestBody Livro livro) {
    return service.atualizar(idLivro, livro);
}

public void excluir(@PathVariable int idLivro) {
    return service.excluir(idLivro);
}
}
