package entities;

public class Rectangle {
	public double wid;
	public double hei;
	public double area() {
		return wid * hei;}
	public double perimeter() {
		return (wid*2)+(hei*2);}
	public double diagonal() {
		double diag = Math.sqrt((hei*hei)+ (wid*wid));
		return diag;}
}
