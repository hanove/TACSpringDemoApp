package com.example.tacspringdemo.repository;

import com.example.tacspringdemo.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
