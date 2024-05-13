package entities;

public class Employee {
	private Integer Id;
	private String name;
	private Double salary;
	
	public Employee(Integer id, String name, Double salary) {
		Id = id;
		this.name = name;
		this.salary = salary;}

	public Integer getId() {
		return Id;}
	
	public void increaseSalary(double percentage) {
		salary += salary*percentage/100;
	}
	
	
	
	
}
