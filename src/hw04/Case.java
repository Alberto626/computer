package hw04;

public class Case {
	private String name;
	private double height;
	private double width;
	private double depth;
	private String type;
	private double price;
	
	public Case(String name, double height, double width, double depth, String type, double price) {
		this.name = name;
		this.height = height;
		this.width = width;
		this.depth = depth;
		this.type = type;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public double getHeight() {
		return height;
	}
	public double getWidth() {
		return width;
	}
	public double getDepth() {
		return depth;
	}
	public String getType() {
		return type;
	}
	public double getPrice() {
		return price;
	}
	public String toString() {
		String menu = " Name:       " + name + "\n";
		menu += "   Type:       " + type + "\n";
		menu += "   Dimensions: " + depth + " x " + width + " x " + height + "\n";
		menu += "   Type:       " + type + "\n";
		menu += "   Price:      " + "$" + price + "\n";
		return menu;
	}
}
