package com.firstlesson.justtry.Repository;

import com.firstlesson.justtry.Model.Produto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto,Integer> {}
    
