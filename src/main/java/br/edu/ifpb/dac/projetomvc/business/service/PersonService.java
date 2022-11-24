package br.edu.ifpb.dac.projetomvc.business.service;

import java.util.List;

import br.edu.ifpb.dac.projetomvc.model.entity.Person;
import br.edu.ifpb.dac.projetomvc.model.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PersonService {
	
	@Autowired
	PersonRepository employeeDAO;
	
	public void create(Person person) {
		employeeDAO.save(person);
	}
	
	public void update(Person person) {
		employeeDAO.save(person);
	}
	
	public void delete(Integer cpf) {
		employeeDAO.deleteById(cpf);
	}
	
	public List<Person> list() {
		return (List<Person>) employeeDAO.findAll();
	}

}
