package com.lariscode.Clientes.api;

import java.util.List;

import com.lariscode.Clientes.model.CadClientes;
import com.lariscode.Clientes.repository.CadClientesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteApi {
@Autowired
private CadClientesRepository repository;

@GetMapping("/api/cliente")
public List<CadClientes> clientes(){
    List<CadClientes> lista = (List<CadClientes>)repository.findAll();
    return lista; 
}

@PostMapping("/api/cliente")    
public String salvar(@RequestBody CadClientes model){
    repository.save(model);
    return "salvo com sucesso";
}

@DeleteMapping("/api/cliente/{id}")    
public String deletar(@PathVariable int id){
    repository.deleteById(id);
    return "deletado com sucesso";
}

@PutMapping("/api/cliente/{id}")    
public String update(@RequestBody CadClientes model, @PathVariable int id){
    if(model.getId() == id){
        repository.save(model);
        return "alterado com sucesso";
    }
    return "id da url diferente do body";
}


}
