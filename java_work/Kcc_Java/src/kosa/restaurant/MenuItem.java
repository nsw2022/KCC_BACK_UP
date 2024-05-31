package kosa.restaurant;



public class MenuItem {
	private MenuItem[] menuArr;
	private String name, description; 
	private int price;
	private int count;
	
	public MenuItem() {
		menuArr = new MenuItem[10];
	}

	public MenuItem(String name, String description, int price) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
	}
	
	public String[] result() {
		
		System.out.print("이름 입력");
		String name = DataInput.sc.nextLine();
		System.out.print("설명 입력");
		String description = DataInput.sc.nextLine();
		System.out.print("가격 입력");
		String price = DataInput.sc.nextLine();
		
		return new String[] {name, description, price};
	}
	
	public void addMenu() {
		
		menuArr[count++] = new MenuItem();
		
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
