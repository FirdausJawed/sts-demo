/**
 * 
 */
package com.flipkart.business;

/**
 * 
 */
public class customerBusiness implements customerInterface {
	//add 
	public void createCustomer() {
		System.out.println("Customer created -->");
	}
	//update 
	public boolean updateCustomer(int customerId) {
		System.out.println("Customer updated by id --> " + customerId);
		return true;
	}
	//delete 
	public boolean deleteCustomer(int customerId) {
		System.out.println("Customer is deleted -->" + customerId);
		return true;
	}
	//list
	public void listCustomer() {
		System.out.println("Customer display over here -->");
	}
}
