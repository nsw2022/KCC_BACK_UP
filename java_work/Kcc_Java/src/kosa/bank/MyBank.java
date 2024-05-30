package kosa.bank;

public class MyBank {
	private Customer[] customers;
	private int customersNum;
	
	public MyBank() {
		customers = new Customer[10];
	}
	
	public void addCustomer(String id, String name, long balance) {
		customers[customersNum++] = new Customer(id, name, balance);
	}

	public Customer getCustomer(String id) {
		for (int i = 0; i < customersNum; i++) {
			if (customers[i]!=null) {
				if (customers[i].getId().equals(id)) {
					return customers[i];
				}
			}
		}
		return null;
	}
	
	public Customer[] getAllCustomers() {
		Customer[] test = new Customer[customersNum];
		for (int i = 0; i < customersNum; i++) {
			test[i] =customers[i]; 
		}
			
		return test;
		
		
		
	}
	

	public Customer[] getCustomers() {
		return customers;
	}

	public void setCustomers(Customer[] customers) {
		this.customers = customers;
	}

	public int getCustomersNum() {
		return customersNum;
	}

	public void setCustomersNum(int customersNum) {
		this.customersNum = customersNum;
	}

	
	
	
}
