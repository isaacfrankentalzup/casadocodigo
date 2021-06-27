package br.com.zupedu.casadocodigo.repository;

import br.com.zupedu.casadocodigo.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AutorRepository extends JpaRepository<Autor, Long> {
   Boolean existsByEmail(String email);
}
