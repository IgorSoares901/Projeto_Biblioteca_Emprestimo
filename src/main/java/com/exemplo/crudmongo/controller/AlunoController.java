package com.exemplo.crudmongo.controller;
import java.util.List;
@RestController //indica que essa classe é um controlador REST
@RequestMapping("/alunos")
@CrossOrigin(origins = "*")
public class AlunoController {
private final AlunoService service;

// isso é um construtor
public AlunoController(AlunoService service) {
    this.service = service;
} // o service dentro dele é o parametro ou a assinatura, e esta fazendo uma injeção de dependencia

@GetMapping // esta mapeando o metodo e da o retorno do que foi pedido
public List<Aluno> listar() {
    return service.listarTodas();
}

@PostMapping // essa chamada na url vira com algo escondido
public Aluno criar(@RequestBody Aluno aluno) {
    return service.salvar(aluno);// esta criando e recebendo o objeto
}

@PutMapping("/{matriculaAluno}")
public Aluno atualizar(@PathVariable int matriculaAluno, @RequestBody Aluno aluno) {
    return service.atualizar(matriculaAluno, aluno); // precisa do id para atualizar
}

@DeleteMapping("/{matriculaAluno}") //esta especificando o que fazer
public void excluir(@PathVariable int matriculaAluno) {
    service.excluir(matriculaAluno);
}
}
