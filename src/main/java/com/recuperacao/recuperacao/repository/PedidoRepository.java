package com.recuperacao.recuperacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.recuperacao.recuperacao.model.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    


}
