package entities;

public class Employee {
	public String name;
	public double salary;
	public double tax;
	
	public double netsalary() {
		return salary - tax;}
	
	public String toString() {
		return name + ", " + "$ " + netsalary();}
	
	public void IncreaseNet(int percent) {
		salary += salary*percent/100;}
	
}
