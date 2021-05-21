package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Abstract.ICustomerService;
import Entities.Customer;


	public class StarbucksCustomerManager extends BaseCustomerManager {
	
		private ICustomerCheckService customerCheckService;

		public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
			super();
			this.customerCheckService = customerCheckService;
		}

		@Override
		public void save(Customer customer) {
			if(customerCheckService.CheckIfRealPerson(customer)) {
			super.save(customer);
			}else {
				System.out.println("Not a valid person.");
			}
		}
     
	
}
