package br.com.erickomelhordevjava.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// Indica que essa classe faz requisições (é um controller)
@RestController
// Anotação responsável pela rota (o sufixo do site .com/ex)
@RequestMapping("/primeiraRota")
public class MyFirstController {
    /** Métodos de acesso do HTTP
     * GET - Buscar uma informação
     * POST - Adicionar um dado/informação
     * PUT - Alterar um dado/informação
     * DELETE - Remover um dado
     * PATCH - Alterar somente uma parte de um dado/info
     */
    @GetMapping("/primeiroMetodo") // Poderia seer vazio pois funciona da mesma forma
    public String firstMessage() {
        return "Funcionou";
    }
}
