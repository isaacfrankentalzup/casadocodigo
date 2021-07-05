package br.com.zupedu.casadocodigo.repository;

import br.com.zupedu.casadocodigo.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
