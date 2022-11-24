package br.edu.ifpb.dac.projetomvc.presentation.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.edu.ofpb.dac.projetomvc.model.entity.Person;
import br.edu.ifpb.dac.projetomvc.business.service.PersonService;


@Controller
public class PersonController {

	@Autowired
	PersonService personService;
	
	public void create(Person person) {
		person.setName(person.getName());
		person.setAge(person.getAge());
		person.setSex(person.getSex());
		personService.create(person);
	}
	
	public void update(br.edu.ifpb.dac.projetomvc.model.entity.Person person) {
		person.setName(person.getName());
		person.setAge(person.getAge());
		person.setSex(person.getSex());
		personService.update(person);
	}
	
	public void delete(Integer cpf) {
		personService.delete(cpf);
	}
	
	public List<Person> list() {
		return personService.list();
	}
	
}
