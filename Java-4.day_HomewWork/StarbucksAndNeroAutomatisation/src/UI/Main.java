package UI;


import java.util.Date;
import java.util.GregorianCalendar;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Adaptors.MernisServiceAdaptor;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;


public class Main {

	public static void main(String[] args) {
	
		BaseCustomerManager customerManager =new StarbucksCustomerManager(new MernisServiceAdaptor());
		BaseCustomerManager customerManager2=new NeroCustomerManager(new CustomerCheckManager());

		Customer customer =new Customer(1, "Mehmet","Karakaþ",(new Date(2001,11,30) ),"123456789");
		customerManager.save(customer);
		customerManager2.save(customer);

	}

}
