package com.example.tacspringdemo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Pessoa {
    private UUID id;
    private String nome;
    private String email;
    private String senha;
}
