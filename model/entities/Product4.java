package entities;

public class Product4 implements Comparable<Product4> {

	private String name;
	private Double price;

	public Product4(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getname() {
		return name;
	}

	public void setName() {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return name + ", " + String.format("%.2f", price);
	}

	@Override
	public int compareTo(Product4 other) {
		return price.compareTo(other.getPrice());
	}
}
