package com.exemplo.crudmongo.repository;
import com.exemplo.crudmongo.model.Emprestimo;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface EmprestimoRepository extends MongoRepository<Emprestimo, String> {

}
