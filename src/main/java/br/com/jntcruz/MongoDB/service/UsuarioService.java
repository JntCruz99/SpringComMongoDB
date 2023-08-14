package br.com.jntcruz.MongoDB.service;

import br.com.jntcruz.MongoDB.entity.Usuario;
import br.com.jntcruz.MongoDB.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuariosRepository usuariosRepository;

    public Usuario save(Usuario usuario){
        return usuariosRepository.save(usuario);
    }

    public List<Usuario> findAll(){
        return usuariosRepository.findAll();
    }

    public Optional<Usuario> findById(String id){
        Optional<Usuario> usuarioOptional = usuariosRepository.findById(id);
        return usuarioOptional;

    }

}
