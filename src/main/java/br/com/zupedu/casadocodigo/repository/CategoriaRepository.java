package br.com.zupedu.casadocodigo.repository;

import br.com.zupedu.casadocodigo.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
