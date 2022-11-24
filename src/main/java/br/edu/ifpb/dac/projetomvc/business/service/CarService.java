package br.edu.ifpb.dac.projetomvc.business.service;

import java.util.List;

import br.edu.ifpb.dac.projetomvc.model.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import br.edu.ofpb.dac.projetomvc.model.entity.Car;

@Service
public class CarService {
	
	@Autowired
	CarRepository carDAO;
	
	public void create(Car car) { carDAO.save(car); }
	
	public void update(Car car) {
		carDAO.save(car);
	}
	
	public void delete(String board) {
		carDAO.deleteById(board);
	}
	
	public List<Car> list() {
		return (List<Car>) carDAO.findAll();
	}


}
