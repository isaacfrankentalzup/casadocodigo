package br.com.zupedu.casadocodigo.Controller;

import br.com.zupedu.casadocodigo.Controller.dto.LivroRequest;
import br.com.zupedu.casadocodigo.Controller.dto.LivroResponse;
import br.com.zupedu.casadocodigo.model.Livro;
import br.com.zupedu.casadocodigo.repository.LivroRepository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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

    @GetMapping
    public List<LivroResponse> buscaLivros(){
        List<Livro> livros = repository.findAll();

        List<LivroResponse> livroResponse = new ArrayList();

        for (Livro livro: livros) {
            livroResponse.add(new LivroResponse(livro.getId(), livro.getTitulo()));

        }

        return livroResponse;
    }
}
