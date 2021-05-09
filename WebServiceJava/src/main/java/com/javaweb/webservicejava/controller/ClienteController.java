package com.javaweb.webservicejava.controller;

import com.javaweb.webservicejava.entity.Cliente;
import com.javaweb.webservicejava.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping(value = "/api/Cliente/")
public class ClienteController {
    @Autowired
    private ClienteService service;

    @PostMapping("/addCliente")
    public Cliente addCliente(@RequestBody Cliente cliente) {
        return service.saveCliente(cliente);
    }


    @GetMapping("/clientes")
    public List<Cliente> findAllClientes() {
        return service.getClientes();
    }

    @GetMapping("/clienteById/{id}")
    public Cliente findClienteById(@PathVariable int id) {
        return service.getClienteById(id);
    }


    @PutMapping("/update")
    public Cliente updateCliente(@RequestBody Cliente cliente) {
        return service.updateCliente(cliente);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCliente(@PathVariable int id) {
        return service.deleteCliente(id);
    }


}
