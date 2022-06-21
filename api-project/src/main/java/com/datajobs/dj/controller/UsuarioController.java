package com.datajobs.dj.controller;

import com.datajobs.dj.entities.Usuario;
import com.datajobs.dj.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    //Criar Usuario
    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping(path = "/salvar")
    public Usuario addUsuario(@RequestBody Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    //Listar todos Usuarios
    @ResponseStatus(value = HttpStatus.ACCEPTED)
    @GetMapping(path = "/listar")
    public List<Usuario> getList() {
        return usuarioRepository.findAll();
    }

    //Buscar por ID
    @GetMapping(path = {"/buscar/id/{id}"})
    public ResponseEntity<Usuario> findById(@PathVariable Long id){
        return usuarioRepository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }
    //Atualizar Usuario por ID
    @PutMapping(value = "/{id}")
    public ResponseEntity<Usuario> updateUser(@PathVariable("id") Long id, @RequestBody Usuario usuario) {
        return usuarioRepository.findById(id)
                .map(record -> {
                    record.setDataCadastro(usuario.getDataCadastro());
                    record.setNome(usuario.getNome());
                    record.setLogin(usuario.getLogin());
                    record.setPassword(usuario.getPassword());
                    record.setEmail(usuario.getEmail());
                    Usuario update = usuarioRepository.save(record);
                    return ResponseEntity.ok().body(update);
                }).orElse(ResponseEntity.notFound().build());
    }

    //Deletar Usuário por ID
    @DeleteMapping(path ={"/{id}"})
    public ResponseEntity<Object> delete(@PathVariable Long id){
        return usuarioRepository.findById(id)
                .map(record -> {
                    usuarioRepository.deleteById(id);
                    return ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());
    }


}
