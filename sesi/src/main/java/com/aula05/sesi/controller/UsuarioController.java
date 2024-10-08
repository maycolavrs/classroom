package com.aula05.sesi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.aula05.sesi.model.Usuario;

@Controller
public class UsuarioController {

    @GetMapping("/usuarios")
    public String mostrarFormulario(Model model) {
        model.addAttribute("usuario", new Usuario()); // Instância vazia
        return "usuarios";
    }

    @PostMapping("/usuarios")
    public String processarFormulario(Usuario usuario) {
        // Lógica para processar o usuário
        return "redirect:/usuarios"; // ou outra página
    }
}
