package br.com.sisdb.greendogdelivery.greendogdelivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.sisdb.greendogdelivery.greendogdelivery.model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

	
}
