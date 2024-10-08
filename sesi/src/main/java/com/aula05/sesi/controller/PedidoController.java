package com.aula05.sesi.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pedido")
public class PedidoController {

    @GetMapping
    public String listarPedidos(Model model) {
        // Lógica para obter a lista de pedidos e adicionar ao modelo
        return "pedidos"; // Retorna a view "pedidos.html"
    }
}

