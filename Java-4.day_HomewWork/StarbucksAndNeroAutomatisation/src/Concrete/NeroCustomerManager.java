package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;



public class NeroCustomerManager extends BaseCustomerManager {

	CustomerCheckService customerCheckService;

	public NeroCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		if(customerCheckService.CheckIfRealPerson(customer)) {
			System.out.println("Nero customer manager : validation successfull.");
			super.save(customer);
		}else {
			System.out.println("Nero Customer Manager : Validation Error - Not a valid person.");
		}
	}
		
	

}
