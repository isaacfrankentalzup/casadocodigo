package br.com.zupedu.casadocodigo.Controller;

import br.com.zupedu.casadocodigo.Controller.dto.PaisRequest;
import br.com.zupedu.casadocodigo.model.Pais;
import br.com.zupedu.casadocodigo.repository.PaisRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/paises")
public class PaisController {

    private PaisRepository repository;

    public PaisController(PaisRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Pais salvaPais(@RequestBody @Valid PaisRequest paisRequest){
        return repository.save(paisRequest.toPais());
    }


}
