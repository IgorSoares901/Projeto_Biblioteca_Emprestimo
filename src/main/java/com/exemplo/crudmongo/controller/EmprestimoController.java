package com.exemplo.crudmongo.controller;
import java.util.List;
@RestController
@RequestMapping("/emprestimos")
@CrossOrigin(origins = "*")
public class EmprestimoController {
private final EmprestimoService service;
public EmprestimoController(EmprestimoService service) {
    this.service = service;
}

@GetMapping
public List<Emprestimo> Listar() {
    return service.listarTodos();
}

@PostMapping
public Emprestimo criar(@RequestBody Emprestimo emprestimo) {
    return service.salvar(emprestimo);
}

@PutMapping("/idEmprestimo")
public Emprestimo atualizar(@PathVariable int idEmprestimo, @RequestBody Emprestimo emprestimo) {
    return service.atualizar(idEmprestimo, emprestimo);
}

@DeleteMapping("/idEmprestimo")
public void excluir(@PathVariable int idEmprestimo) {
    service.excluir(idEmprestimo);
}
}
