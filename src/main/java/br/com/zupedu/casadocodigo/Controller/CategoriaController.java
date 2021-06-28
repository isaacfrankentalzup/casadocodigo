package br.com.zupedu.casadocodigo.Controller;

import br.com.zupedu.casadocodigo.Controller.dto.CategoriaRequest;
import br.com.zupedu.casadocodigo.Controller.dto.CategoriaResponse;
import br.com.zupedu.casadocodigo.model.Categoria;
import br.com.zupedu.casadocodigo.repository.CategoriaRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("api/v1/categorias")
public class CategoriaController {

    private CategoriaRepository categoriaRepository;

    public CategoriaController(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    @PostMapping
    CategoriaResponse salvarCategoria(@RequestBody @Valid CategoriaRequest categoriaRequest){
        Categoria categoria = categoriaRepository.save(categoriaRequest.toCategoria());

        return new CategoriaResponse(categoria.getNome());
    }
}
