package by.htp.task02.start;

import java.util.ArrayList;
import java.util.Date;

import by.htp.task02.entity.Depo;
import by.htp.task02.entity.Train;
import by.htp.task02.logic.TrainLogic;
import by.htp.task02.presentation.TrainView;

public class Main {

	public static void main(String[] args) {

		TrainView view = new TrainView();
		TrainLogic logic = new TrainLogic();

		ArrayList<Train> trainList = new ArrayList<Train>();
		Depo depo = new Depo(trainList);
		trainList.add(new Train("Moscow", 666, new Date(121, 7, 13, 15, 30)));
		trainList.add(new Train("London", 777, new Date(121, 8, 22, 19, 15)));
		trainList.add(new Train("Paris", 888, new Date(121, 11, 3, 11, 45)));
		trainList.add(new Train("Moscow", 333, new Date(121, 3, 7, 22, 00)));
		trainList.add(new Train("Prague", 555, new Date(121, 12, 18, 13, 05)));

		view.printDepoTrains(depo.getTrains());
		logic.sortByTrainNumber(depo.getTrains());

		System.out.println("..........sortByTrainNumber..........");

		view.printDepoTrains(depo.getTrains());

		System.out.println("..........getTrainInfo..........");

		view.getTrainInfo(777, depo);

		System.out.println("..........sortByPointName..........");

		logic.sortByPointName(depo.getTrains());
		view.printDepoTrains(depo.getTrains());

		System.out.println("..........sortByPointNameAndDepartTime..........");

		logic.sortByPointNameAndDepartTime(depo.getTrains());
		view.printDepoTrains(depo.getTrains());

	}
}
