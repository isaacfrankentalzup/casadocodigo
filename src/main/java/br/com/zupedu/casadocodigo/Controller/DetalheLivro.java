package br.com.zupedu.casadocodigo.Controller;

import br.com.zupedu.casadocodigo.Controller.dto.DetalheLivroResponse;
import br.com.zupedu.casadocodigo.model.Livro;
import br.com.zupedu.casadocodigo.repository.LivroRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/detalheslivros")
public class DetalheLivro {

    private LivroRepository repository;

    public DetalheLivro(LivroRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/{id}")
    public ResponseEntity<DetalheLivroResponse> buscarLivroDetalhes(@PathVariable Long id){
        Optional<Livro>  livroEncontrado = repository.findById(id);

        if(livroEncontrado.isPresent()){
            Livro livro = livroEncontrado.get();
            DetalheLivroResponse detalheLivroResponse =
                    new DetalheLivroResponse(livro.getTitulo(),
                            livro.getResumo(),
                            livro.getSumario(),
                            livro.getPreco(),
                            livro.getPaginas(),
                            livro.getIsbn(),
                            livro.getAutor().getNome(),
                            livro.getAutor().getDescricao());
            return ResponseEntity.ok(detalheLivroResponse);

        }
        return ResponseEntity.notFound().build();
    }
}
