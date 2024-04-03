package com.example.tacspringdemo.controller;

import com.example.tacspringdemo.dto.PessoaDTO;
import com.example.tacspringdemo.model.Pessoa;
import com.example.tacspringdemo.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @GetMapping("id")
    public String get(@PathVariable("id") String id){
        return "Pessoa com id " + id;
    }

    @GetMapping
    public String getAll(){
        return "Todas as pessoas";
    }

    @PostMapping
    public ResponseEntity<Object> create(@RequestBody PessoaDTO dto) {
        try {
            var res = pessoaService.create(dto);
            return ResponseEntity.status(HttpStatus.CREATED).body(res);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
//        pessoa.setId();
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
