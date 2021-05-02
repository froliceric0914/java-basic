package Collections;

public class Vehicles {
	String make;
	String color;
	int price;
	boolean finance;
	
	@Override
	public String toString() {
		return "Vehicles [make=" + make + ", color=" + color + ", price=" + price + ", finance=" + finance + "]";
	}
	public Vehicles(String make, String color, int price, boolean finance) {
		super();
		this.make = make;
		this.color = color;
		this.price = price;
		this.finance = finance;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isFinance() {
		return finance;
	}
	public void setFinance(boolean finance) {
		this.finance = finance;
	}
	
}
