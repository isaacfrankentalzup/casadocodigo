package br.com.zupedu.casadocodigo.Controller;

import br.com.zupedu.casadocodigo.Controller.dto.AutorResponse;
import br.com.zupedu.casadocodigo.Controller.dto.AutorResquest;
import br.com.zupedu.casadocodigo.model.Autor;
import br.com.zupedu.casadocodigo.repository.AutorRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.ValidationException;
import java.util.Optional;

@RestController
@RequestMapping("/autores")
public class AutorController {

    AutorRepository repository;

    public AutorController(AutorRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public ResponseEntity<AutorResponse>  salvarAutor (@RequestBody @Valid AutorResquest autorResquest){

        Boolean existeEmail = repository.existsByEmail(autorResquest.getEmail());

        if(existeEmail){
            return ResponseEntity.badRequest().build();
        }

        Autor autorSalvo = repository.save(autorResquest.toAutor());

        AutorResponse resposta = new AutorResponse(
                autorSalvo.getId(),
                autorSalvo.getNome(),
                autorSalvo.getEmail(),
                autorSalvo.getCreateAt(),
               "Pige pas encore tout"
        );
         return ResponseEntity.ok(resposta);
    }
}
