package br.com.zupedu.casadocodigo.Controller;

import br.com.zupedu.casadocodigo.Controller.dto.AutorResponse;
import br.com.zupedu.casadocodigo.Controller.dto.AutorResquest;
import br.com.zupedu.casadocodigo.model.Autor;
import br.com.zupedu.casadocodigo.repository.AutorRepository;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/autores")
public class AutorController {

    AutorRepository repository;

    public AutorController(AutorRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public AutorResponse salvarAutor (@RequestBody @Valid AutorResquest autorResquest){

        Autor autorSalvo = repository.save(autorResquest.toAutor());

        AutorResponse resposta = new AutorResponse(
                autorSalvo.getId(),
                autorSalvo.getNome(),
                autorSalvo.getEmail(),
                autorSalvo.getCreateAt(),
               "Pige pas encore tout"
        );
         return resposta;
    }
}
