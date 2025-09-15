package com.exemplo.crudmongo.controller;
import java.util.List;
@RequestController //indica que esta classe é um controller
@RequestMapping("/livros") //define o endpoint base
@CrossOrigin(origins = "*") //permite requisições de
public class LivroController {
private final LivroService service;
public LivroController(LivroService service) {
    this.service = service;
}

@GetMapping
public List<Livro> Listar() {
    return service.ListarTodos();
}

@PostMapping
public Livro criar(@RequestBody Livro livro) {
    return service.salvar(livro);
}

@PutMapping("/{idLivro}")
public Livro atualizar(@PathVariable int idLivro, @RequestBody Livro livro) {
    return service.atualizar(idLivro, livro);
}

@DeleteMapping("/{idLivro}")
public void excluir(@PathVariable int idLivro) {
    return service.excluir(idLivro);
}
}
