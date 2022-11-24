package br.edu.ifpb.dac.projetomvc.model.repository;

import br.edu.ofpb.dac.projetomvc.model.entity.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends PagingAndSortingRepository <Person, Integer> {
	
	List<Person> findByName(String name);
	Page<Person> findByCpfLessThan(Integer cpf, Pageable page);
	
}
