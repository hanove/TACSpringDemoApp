package com.example.tacspringdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tacspringdemo.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}