package com.example.tacspringdemo.controller;

import com.example.tacspringdemo.model.Pessoa;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @GetMapping("id")
    public String get(@PathVariable("id") String id){
        return "Pessoa com id " + id;
    }

    @GetMapping
    public String getAll(){
        return "Todas as pessoas";
    }

    @PostMapping
    public Pessoa create(@RequestBody Pessoa pessoa) {
        System.out.println(pessoa);
        pessoa.setId(UUID.randomUUID());
        return pessoa;
    }

    @PutMapping("/{id}")
    public String update(@PathVariable("id") String id) {
        return "Atualizar pessoa" + id;
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") String id) {
        return "deletar pessoa" + id;
    }
}
