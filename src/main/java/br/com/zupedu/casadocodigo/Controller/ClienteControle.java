package br.com.zupedu.casadocodigo.Controller;


import br.com.zupedu.casadocodigo.Controller.dto.ClienteRequest;
import br.com.zupedu.casadocodigo.model.Cliente;
import br.com.zupedu.casadocodigo.repository.ClienteRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.Option;
import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/clientes")

public class ClienteControle {

    private ClienteRepository clienteRepository;

    public ClienteControle(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @PostMapping
    public Long salvarCliente(@RequestBody @Valid ClienteRequest clienteRequest){
        Cliente cliente = clienteRequest.toCliente();
        clienteRepository.save(cliente);
        return cliente.getId();
    }
}
