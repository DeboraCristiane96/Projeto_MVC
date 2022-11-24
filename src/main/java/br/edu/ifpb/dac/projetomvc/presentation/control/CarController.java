package br.edu.ifpb.dac.projetomvc.presentation.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.edu.ofpb.dac.projetomvc.model.entity.Car;
import br.edu.ifpb.dac.projetomvc.business.service.CarService;

@Controller
public class CarController {
	
	@Autowired
	CarService carService;
	
	public void create(Car car) {
		car.setBoard(car.getBoard());
		car.setBrand(car.getBrand());
		car.setYear(car.getYear());
		car.setColor(car.getColor());
		carService.create(car);
	}
	
	public void update(Car car) {
		car.setBoard(car.getBoard());
		car.setBrand(car.getBrand());
		car.setYear(car.getYear());
		car.setColor(car.getColor());
		carService.update(car);
	}
	
	public void delete(String board) {
		carService.delete(board);
	}
	
	public List<Car> list() {
		return carService.list();
	}

}
