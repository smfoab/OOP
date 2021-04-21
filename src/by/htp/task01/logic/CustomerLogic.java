package by.htp.task01.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import by.htp.task01.entity.Customer;

public class CustomerLogic {
	public ArrayList<Customer> getCustomerSortedBySurName(ArrayList<Customer> customerList) {

		ArrayList<Customer> customers = customerList;

		Collections.sort(customers, new Comparator<Customer>() {
			@Override
			public int compare(Customer o1, Customer o2) {
				return o1.getSurName().compareToIgnoreCase(o2.getSurName());
			}
		});
		return customers;
	}

	public ArrayList<Customer> getCustomerByCreditCardNumberInterval(ArrayList<Customer> customerList,
			int startInterval, int endInterval) {

		ArrayList<Customer> customers = new ArrayList<Customer>();
		for (Customer customer : customerList) {
			if (customer.getCreditCardNumber() >= startInterval && customer.getCreditCardNumber() <= endInterval) {
				customers.add(customer);
			}
		}
		return customers;
	}

}
