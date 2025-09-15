package com.exemplo.crudmongo.repository;
import com.exemplo.crudmongo.model.Aluno;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface AlunoRepository extends MongoRepository<Aluno, String> {

}
