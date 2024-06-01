package kosa.restaurant;

public class Appetizer extends MenuItem{
	private int calories;
	protected boolean vegetarian;
	
	
	public Appetizer(String name, String description, int price, int calories, boolean vegetarian) {
		super(name, description, price);
		this.calories = calories;
		this.vegetarian = vegetarian;
	}


	public int getCalories() {
		return calories;
	}


	public void setCalories(int calories) {
		this.calories = calories;
	}


	public boolean isVegetarian() {
		return vegetarian;
	}


	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}
	
	
	
	
	
}
