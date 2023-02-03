package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entities.Address;
import Entities.Department;
import Entities.Employee;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Informações do departamento

		System.out.print("Nome do departamento: ");
		String nameDepartment = sc.nextLine();

		System.out.print("Dia do pagamento: ");
		String payDay = sc.nextLine();
		int payDayValidated = Integer.parseInt(payDay);

		System.out.print("E-mail: ");
		String email = sc.nextLine();

		System.out.print("Telefone: ");
		String phone = sc.nextLine();

		System.out.println("------------------");
		
		// Instanciando o endereço
		
		Address address = new Address(email, phone);

		Department department = new Department(nameDepartment, payDayValidated, address);

		// Informações dos empregados

		System.out.print("Quantos funcionários tem o departamento? ");
		String numberEmployees = sc.nextLine();
		int numberEmployeesValidated = Integer.parseInt(numberEmployees);

		// Instanciando os empregados

		Employee employees[] = new Employee[numberEmployeesValidated];

		for (int i = 0; i < numberEmployeesValidated; i++) {

			System.out.println("Dados do funcionário " + (i + 1) + ": ");
			
			System.out.print("Nome: ");
			String nameEmployee = sc.nextLine();

			System.out.print("Salário: ");
			String salary = sc.nextLine();
			Double salaryValidated = Double.parseDouble(salary);

			employees[i] = new Employee(nameEmployee, salaryValidated);
			department.addEmployee(employees[i]);
			
		}
		
		//Apresentação do relatório
		showReport(department);
	}
	
	private static void showReport(Department dept) {
		System.out.println(dept.toString());
	}

}
