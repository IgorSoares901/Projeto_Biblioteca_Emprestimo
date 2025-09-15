package com.exemplo.crudmongo.repository;
import com.exemplo.crudmongo.model.Livro;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LivroRepository extends MongoRepository<Livro, String> {

}
