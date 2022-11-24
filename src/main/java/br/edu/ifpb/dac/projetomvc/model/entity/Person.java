package br.edu.ifpb.dac.projetomvc.model.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

@Entity
public class Person implements Serializable {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cpf;
    private String name;
    private Integer age;
    private String sex;
    
    @OneToMany
    private Set<Car> cars;

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Set<Car> getCars() {
		return cars;
	}

	public void setCars(Set<Car> cars) {
		this.cars = cars;
	}

	public Person() {}

	@Override
	public int hashCode() {
		return Objects.hash(age, cars, cpf, name, sex);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(age, other.age) && Objects.equals(cars, other.cars) && Objects.equals(cpf, other.cpf)
				&& Objects.equals(name, other.name) && Objects.equals(sex, other.sex);
	}

	@Override
	public String toString() {
		return "Person [cpf=" + cpf + ", name=" + name + ", age=" + age + ", sex=" + sex + ", cars=" + cars + "]";
	}
	
}