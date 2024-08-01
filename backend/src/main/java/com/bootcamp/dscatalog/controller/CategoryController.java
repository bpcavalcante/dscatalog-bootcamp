package com.bootcamp.dscatalog.controller;

import com.bootcamp.dscatalog.entities.Category;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

// Responsavel por enviar e receber os dados para o front end, não tem regras de negocio
@RestController
@RequestMapping(value = "/categories")
public class CategoryController {


    // ResponseEntity encapsula uma resposta HTTP que retornara para o cliente
    @GetMapping
    public ResponseEntity<List<Category>> findAll() {
        List<Category> categories = new ArrayList<>();

        categories.add(new Category(1L, "Books"));
        categories.add(new Category(2L, "Electronics"));
        categories.add(new Category(3L, "Casa"));

        // ok() deixa eu responder uma resposta 200
        return ResponseEntity.ok().body(categories);
    }

}
