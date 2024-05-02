package entities;

public class Product {
	private String name;
	private double price;
	private double quantity;
	
	public Product() {
	}
	
	public Product(String name, double price, double quantity){
		this.name = name;
		this.price = price;
		this.quantity = quantity;}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;}
	
	public String getName() {
		return name;}
	
	public double getPrice() {
		return price;}
	
	public double getQuantity() {
		return quantity;}
	
	public double TotalValueStock() {
		return quantity * price;}
	
	public String toString() {
		return name + ", $ " + price + ", " + quantity + " units, Total: $ " + TotalValueStock();}
	
	public void AddProducts(double quantity) {
		this.quantity += quantity;}
	
	public void RemoveProducts(double quantity) {
		this.quantity -= quantity;}
	
}
