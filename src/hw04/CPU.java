package hw04;

public class CPU {
	private String name;
 	private double speed;
 	private double price;
 	
 	public CPU(String name, double speed, double price) {
 		this.name = name;
 		this.speed = speed;
 		this.price = price;
 	}
 	public String getName() {
 		return name;
 	}
 	public double getSpeed() {
 		return speed;
 	}
 	public double getPrice() {
 		return price;
 	}
 	public String toString() {
 		String menu = "Name:  " + name;
 		menu += "\n  Speed: " + speed + "GHz\n";
 		menu += "  Price: " + price + "\n";
 		return menu;
 	}
}
