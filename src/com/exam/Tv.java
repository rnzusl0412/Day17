package com.exam;

public class Tv {
	private String name;
	private int price;
	private String description;

	public Tv() {
		this("noname", 10000, "Àü±â¹ä¼Ü");
	}

	public Tv(String name, int price, String description) {
		super();
		this.name = name;
		this.price = price;
		this.description = description;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {

		String str = String.format("%-10s %10d %10s\n", this.name, this.price, this.description);
		return str;

	}

}
