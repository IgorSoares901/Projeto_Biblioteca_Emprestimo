package com.exemplo.crudmongo.controller;
public class EmprestimoController {
private final EmprestimoService service;
public EmprestimoController(EmprestimoService service) {
    this.service = service;
}

public List<Emprestimo> Listar() {
    return service.listarTodos();
}

public Emprestimo criar(@RequestBody Emprestimo emprestimo) {
    return service.salvar(emprestimo);
}

public Emprestimo atualizar(@PathVariable int idEmprestimo, @RequestBody Emprestimo emprestimo) {
    return service.atualizar(idEmprestimo, emprestimo);
}

public void excluir(@PathVariable int idEmprestimo) {
    service.excluir(idEmprestimo);
}
}
