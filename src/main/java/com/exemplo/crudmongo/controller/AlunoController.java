package com.exemplo.crudmongo.controller;

public class AlunoController {
private final AlunoService service;
public AlunoController(AlunoService service) {
    this.service = service;
}

public List<Aluno> listar() {
    return service.listarTodas();
}

public Aluno criar(@RequestBody Aluno aluno) {
    return service.salvar(aluno);
}

public Aluno atualizar(@PathVariable int matriculaAluno, @RequestBody Aluno aluno) {
    return service.atualizar(matriculaAluno, aluno);
}

public void excluir(@PathVariable int matriculaAluno) {
    service.excluir(matriculaAluno);
}
}
