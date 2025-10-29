package com.recuperacao.recuperacao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.recuperacao.recuperacao.model.Pedido;
import com.recuperacao.recuperacao.repository.PedidoRepository;

@Controller
public class PedidoController {

    @Autowired
    private PedidoRepository pedidoRepository;

    @GetMapping("/pedidos")
    public String listaPedidos(Model model, @RequestParam(defaultValue = "0") int page) {

        int tamanhoPagina = 5;
        Pageable configPagina = PageRequest.of(page, tamanhoPagina);
        Page<Pedido> paginaPedido = pedidoRepository.findAll(configPagina);

        model.addAttribute("paginaPedido", paginaPedido);
     
        model.addAttribute("novoPedido", new Pedido());

        return "index";
    }

    @PostMapping("/adicionar")
    public String adicionarTarefas(@ModelAttribute Pedido novoPedido){

        pedidoRepository.save(novoPedido);

        return"redirect:pedidos";

    }





}
