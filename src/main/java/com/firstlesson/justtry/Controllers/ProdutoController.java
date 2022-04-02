package com.firstlesson.justtry.Controllers;

import java.util.List;
import java.util.Optional;

import com.firstlesson.justtry.Model.Produto;
import com.firstlesson.justtry.Services.ProdutoServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
    
    @Autowired
    private ProdutoServices produtoServices;

    @GetMapping
    public List<Produto> ObterTodos() {
        return produtoServices.ObterTodos();
    }

    @GetMapping("/{id}")
    public Optional <Produto> ObterPorId(@PathVariable Integer id) {
        return produtoServices.ObterPorId(id);
    }

    @PostMapping
    public Produto AddProduct( @RequestBody Produto produto) {

        return produtoServices.adicionar(produto);

    }

    @DeleteMapping("/{id}")
    public String deletar(@PathVariable Integer id) {
         produtoServices.deletar(id);
         return "produto :"+ id+ "Foi deletado" ;

    }

    @PutMapping("/{id}")
    public Produto atualizarProduct(@PathVariable Integer id,@RequestBody Produto produto) {
        return produtoServices.atualizar(id, produto);
    }
}

