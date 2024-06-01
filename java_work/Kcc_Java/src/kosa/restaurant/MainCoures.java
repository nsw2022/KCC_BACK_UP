package kosa.restaurant;

public class MainCoures extends MenuItem {
	private boolean glutenFree;
	
	public MainCoures(String name,  String description, int price, boolean glutenFree) {
		super(name, description, price);
        this.glutenFree = glutenFree;
    }

    public boolean isGlutenFree() {
        return glutenFree;
    }

    public void setGlutenFree(boolean glutenFree) {
        this.glutenFree = glutenFree;
    }
}
