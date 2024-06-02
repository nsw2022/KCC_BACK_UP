package kosa.restaurant;

public class Dessert extends MenuItem{
	private boolean glutenFree;

	public Dessert(String name, String description, int price,int calories ,boolean glutenFree) {
		super(name, description, price, calories);
		this.glutenFree = glutenFree;
	}

	public boolean isGlutenFree() {
		return glutenFree;
	}

	public void setGlutenFree(boolean glutenFree) {
		this.glutenFree = glutenFree;
	}
	
	
	
}
