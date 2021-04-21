package by.htp.task01.presentation;

import java.util.ArrayList;

import by.htp.task01.entity.Customer;

public class CustomerView {
	public void printList(ArrayList<Customer> list) {
		for (Customer customer : list) {
			System.out.println(customer.toString());

		}
	}

}
