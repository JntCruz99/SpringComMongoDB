package br.com.jntcruz.MongoDB.controller;

import br.com.jntcruz.MongoDB.entity.Usuario;
import br.com.jntcruz.MongoDB.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

@RestController
@RequestMapping(value = "/usuarios")
public class Controller {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public ResponseEntity<?> listarUser(){
        return ResponseEntity.status(HttpStatus.OK).body(usuarioService.findAll());
    }

    @PostMapping
    public ResponseEntity<Usuario> salvarUser(@RequestBody Usuario user){
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioService.save(user));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarId(@PathVariable String id){
        return ResponseEntity.status(HttpStatus.OK).body(usuarioService.findById(id));
    }

}
