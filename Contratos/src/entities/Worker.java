package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {

	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	
	//Composi��o de objetos
	private Department department; //um trabalhador tem um departamento
	private List<HourContract> contracts = new ArrayList<>();  //um trabalhador tem v�rios contratos por isso uma lista de contratos
	
	
	
	
	public Worker() {
		
	}


	//no construtor com argumentos n�o colocar atributos do tipo lista
	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public WorkerLevel getLevel() {
		return level;
	}


	public void setLevel(WorkerLevel level) {
		this.level = level;
	}


	public Double getBaseSalary() {
		return baseSalary;
	}


	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}


	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department departament) {
		this.department = department;
	}


	public List<HourContract> getContracts() {
		return contracts;
	}


	/*
	 * public void setContracts(List<HourContract> contracts) { this.contracts =
	 * contracts; }
	 */
	
	
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	
	
	public double income(int year, int month) {
		
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		for(HourContract c : contracts) {
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = cal.get(Calendar.MONTH) + 1; //importante **** o m�s do calendar come�a com zero
			if(c_year == year && c_month == month) {
				sum += c.totalValue();
			}
		}
		
		return sum;
		
	}
	
	
	
}
