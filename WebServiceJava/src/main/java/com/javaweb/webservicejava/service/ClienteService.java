package com.javaweb.webservicejava.service;

import com.javaweb.webservicejava.entity.Cliente;
import com.javaweb.webservicejava.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository repository;

    public Cliente saveCliente(Cliente cliente) {
        return repository.save(cliente);
    }

    public List<Cliente> getClientes() {
        return repository.findAll();
    }

    public Cliente getClienteById(int id) {
        return repository.findById(id).orElse(null);
    }

    public String deleteCliente(int id) {
        repository.deleteById(id);
        return "Cliente removido: " + id;
    }

    public Cliente updateCliente(Cliente cliente) {
        Cliente atualCliente = repository.findById(cliente.getId()).orElse(null);
        atualCliente.setNomeCompleto(cliente.getNomeCompleto());
        atualCliente.setEmail(cliente.getEmail());
        return repository.save(atualCliente);
    }

}
