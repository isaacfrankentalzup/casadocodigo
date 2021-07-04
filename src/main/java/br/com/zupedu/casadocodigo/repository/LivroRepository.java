package br.com.zupedu.casadocodigo.repository;

import br.com.zupedu.casadocodigo.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {

}
