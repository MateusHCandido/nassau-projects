package com.datajobs.dj.controller;

import com.datajobs.dj.entities.Cliente;
import com.datajobs.dj.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    ClienteRepository clienteRepository;

    //Criar Usuario
    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping(path = "/salvar")
    public Cliente addCliente(@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    //Listar todos Usuarios
    @ResponseStatus(value = HttpStatus.ACCEPTED)
    @GetMapping(path = "/listar")
    public List<Cliente> getList() {
        return clienteRepository.findAll();
    }

    //Buscar por ID
    @GetMapping(path = {"/buscar/id/{id}"})
    public ResponseEntity<Cliente> findById(@PathVariable Long id){
        return clienteRepository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }
    //Atualizar Usuario por ID
    @PutMapping(value = "/{id}")
    public ResponseEntity<Cliente> updateUser(@PathVariable("id") Long id, @RequestBody Cliente cliente) {
        return clienteRepository.findById(id)
                .map(record -> {
                    record.setDataCadastro(cliente.getDataCadastro());
                    record.setNome(cliente.getNome());
                    record.setCpf(cliente.getCpf());
                    record.setFormacao(cliente.getFormacao());
                    record.setAnoFormacao(cliente.getAnoFormacao());
                    record.setEmail(cliente.getEmail());
                    record.setDataNascimento(cliente.getDataNascimento());
                    Cliente update = clienteRepository.save(record);
                    return ResponseEntity.ok().body(update);
                }).orElse(ResponseEntity.notFound().build());
    }


    //Deletar Usuário por ID
    @DeleteMapping(path ={"/{id}"})
    public ResponseEntity<Object> delete(@PathVariable Long id){
        return clienteRepository.findById(id)
                .map(record -> {
                    clienteRepository.deleteById(id);
                    return ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());
    }
}
