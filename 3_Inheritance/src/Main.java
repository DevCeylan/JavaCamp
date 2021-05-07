
public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer mehmet = new IndividualCustomer();
		mehmet.customerNumber="3099";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "5818";
		
		CustomerManager customerManager = new CustomerManager();
		
		Customer[] customers = {mehmet,hepsiBurada};

		customerManager.addMultiple(customers);
		
	}

}
