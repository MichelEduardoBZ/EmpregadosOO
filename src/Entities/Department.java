package Entities;

import java.util.ArrayList;
import java.util.List;

public class Department {

	private String name;
	private Integer payDay;
	private Employee employees;
	private Address address;

	public Department() {
	}

	public Department(String name, Integer payDay, Address address) {
		super();
		this.name = name;
		this.payDay = payDay;
		this.address = address;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPayDay() {
		return payDay;
	}

	public void setPayDay(Integer payDay) {
		this.payDay = payDay;
	}

	List<Employee> employeeList = new ArrayList<>();

	public void addEmployee(Employee employee) {
		employeeList.add(employee);
	}

	public void removemployee(Employee employee) {
		employeeList.remove(employee);
	}

	public double payRoll() {
		double sum = 0;

		for (Employee x : employeeList) {
			sum += x.getSalary();
		}

		return sum;
	}

	// Apresentando a folha de pagamento
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("FOLHA DE PAGAMENTO: \n");

		sb.append("Departamento Vendas = ");
		sb.append(this.payRoll() + "\n");

		sb.append("Pagamento realizado no dia ");
		sb.append(this.getPayDay() + "\n");

		sb.append("Funcionários: \n");

		for (Employee employees : employeeList) {
			sb.append(employees.getName() + "\n");
		}
		
		sb.append("Para dúvidas favor entrar em contato: ");
		sb.append(address.getEmail());

		return sb.toString();
	}

}
