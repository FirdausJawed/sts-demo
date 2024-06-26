/**
 * 
 */
package com.flipkart.client;
import com.flipkart.business.customerBusiness;
import com.flipkart.business.customerInterface;

/**
 * 
 */
public class customerClientApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//client --> business --> bean
		
		//create the business instance
		customerInterface service = new customerBusiness();
		service.createCustomer();
		System.out.println("updated customer" + service.updateCustomer(101));
		System.out.println("updated customer" + service.deleteCustomer(101));
	}

}
