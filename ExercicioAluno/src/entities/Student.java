package entities;

public class Student {
	public double grade1;
	public double grade2;
	public double grade3;
	public double FinalGrade() {
		return grade1 + grade2 + grade3;}
	public void result() {
		if(FinalGrade() < 60) {
			double failed = 60 - FinalGrade();
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", failed);}
		else {
			System.out.println("PASS");}
	}
	}
