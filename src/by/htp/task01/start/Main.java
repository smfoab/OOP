package by.htp.task01.start;

import java.util.ArrayList;

import by.htp.task01.entity.Bank;
import by.htp.task01.entity.Customer;
import by.htp.task01.logic.CustomerLogic;
import by.htp.task01.presentation.CustomerView;

public class Main {
	public static void main(String[] args) {

		Bank bank = new Bank("ВаБанк");

		bank.addCustomerToBankList(new Customer(231, "Петров", "Иван", "Иванович", "Ивановская 34", 354, 235467));
		bank.addCustomerToBankList(new Customer(452, "Сидоров", "Пётр", "Петрович", "Петровка 38", 856, 895456));
		bank.addCustomerToBankList(new Customer(567, "Иванов", "Сидор", "Сидорович", "Сезам 77", 656, 645356));

		CustomerView view = new CustomerView();
		view.printList(bank.getCustomerList());

		System.out.println("----------------------------------");

		CustomerLogic logic = new CustomerLogic();
		ArrayList<Customer> customers = logic.getCustomerSortedBySurName(bank.getCustomerList());

		view.printList(customers);

		System.out.println("----------------------------------");

		ArrayList<Customer> customers1 = logic.getCustomerByCreditCardNumberInterval(bank.getCustomerList(), 350, 660);

		view.printList(customers1);

	}

}
