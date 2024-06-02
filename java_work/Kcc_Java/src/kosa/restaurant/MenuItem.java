package kosa.restaurant;



public class MenuItem {
	
	private String name, description; 
	private int price;
	private int calories;
	
	public MenuItem() {}

	public MenuItem(String name, String description, int price, int calories) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.calories = calories;
	}
	

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	

}
