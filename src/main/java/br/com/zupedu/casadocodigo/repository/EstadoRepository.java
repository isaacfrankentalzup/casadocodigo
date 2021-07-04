package br.com.zupedu.casadocodigo.repository;

import br.com.zupedu.casadocodigo.model.Estado;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EstadoRepository extends JpaRepository<Estado, Long> {

    Optional<Estado>  findByNomeAndPaisId(String nome, Long id);

}
