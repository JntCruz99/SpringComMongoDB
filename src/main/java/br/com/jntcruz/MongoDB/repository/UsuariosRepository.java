package br.com.jntcruz.MongoDB.repository;

import br.com.jntcruz.MongoDB.entity.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuariosRepository extends MongoRepository<Usuario, String> {
}
