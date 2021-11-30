package com.lariscode.Clientes.controller;

import java.util.List;

import com.lariscode.Clientes.model.CadClientes;
import com.lariscode.Clientes.repository.CadClientesRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CadClientesController {
    private CadClientesRepository repository;

    public CadClientesController(CadClientesRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/cliente")
    public String clientes(Model req){
        List<CadClientes> lista = (List<CadClientes>)repository.findAll();
        req.addAttribute("clientes", lista);
        return "clientes";
        
    }

    @GetMapping("/cliente/form")
    public String formulario(Model req){
        CadClientes model = new CadClientes();
        req.addAttribute("cliente", model);
        return "cadcliente-form";
    }

    @PostMapping("/cliente/salvar")    
    public String salvar(CadClientes model){
        repository.save(model);
        return "redirect:/cliente";
    }

    @GetMapping("/cliente/deletar/{id}")
    public String deletar(@PathVariable int id){
        repository.deleteById(id);
        return "redirect:/cliente";
    }

    @GetMapping("/cliente/editar/{id}")
    public String editar(@PathVariable int id, Model req){
        CadClientes model = repository.findById(id).get();
        req.addAttribute("cliente", model);
        return "cadcliente-form";
    }
}