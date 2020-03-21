package br.com.sisdb.greendogdelivery.greendogdelivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.sisdb.greendogdelivery.greendogdelivery.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	

}
