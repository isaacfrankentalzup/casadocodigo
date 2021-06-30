package br.com.zupedu.casadocodigo.Controller;

import br.com.zupedu.casadocodigo.Controller.dto.LivroRequest;
import br.com.zupedu.casadocodigo.repository.LivroRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/livros")
public class LivroController {

    private LivroRepository repository;

    public LivroController(LivroRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public void salvaLivro(@RequestBody LivroRequest livroRequest){
        repository.save(livroRequest.toLivro());
    }
}
