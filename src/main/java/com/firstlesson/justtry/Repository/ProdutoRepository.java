package com.firstlesson.justtry.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.firstlesson.justtry.Model.Produto;

public class ProdutoRepository {
    
    private List<Produto> produtos = new ArrayList<Produto>();

    private Integer ultimoId = 0 ;

    public List<Produto> obterTodos(){
        return produtos;
    }

    public Optional <Produto> obterPorId(Integer id){
        return produtos
        .stream()
        .filter(produto -> produto.getId() == id)
        .findFirst();
    }

    public Produto adicionar(Produto produto){
    ultimoId++;
    produto.setId(ultimoId);
    produtos.add(produto);

    return produto;
    }



}
