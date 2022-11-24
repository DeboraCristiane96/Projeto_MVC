package br.edu.ifpb.dac.projetomvc.model.repository;

import br.edu.ofpb.dac.projetomvc.model.entity.Car;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends PagingAndSortingRepository <Car, String> {
	
	List<Car> findByBrand(String brand);
	Page<Car> findByBoardLessThan(String board, Pageable page);
	
}