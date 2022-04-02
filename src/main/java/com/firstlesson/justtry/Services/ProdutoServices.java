package com.firstlesson.justtry.Services;

import java.util.List;
import java.util.Optional;

import com.firstlesson.justtry.Model.Produto;
import com.firstlesson.justtry.Repository.ProdutoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoServices {
    
    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto>ObterTodos() {
        return produtoRepository.obterTodos();
    }

    public Optional<Produto>ObterPorId(Integer id) {
        return produtoRepository.obterPorId(id);
    }

    public Produto adicionar(Produto produto){
        return produtoRepository.adicionar(produto);
    }

    public void deletar(Integer id){
        produtoRepository.deletar(id);
    }

    public Produto atualizar(Integer id,Produto produto){
        produto.setId(id);

        return produtoRepository.atualizar(produto);
    }

    
}
