package br.com.zupedu.casadocodigo.repository;

import br.com.zupedu.casadocodigo.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, Long > {
}
