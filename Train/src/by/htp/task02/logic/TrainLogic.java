package by.htp.task02.logic;

import java.util.ArrayList;

import java.util.List;

import by.htp.task02.entity.Train;

public class TrainLogic {

	public ArrayList<Train> sortByTrainNumber(ArrayList<Train> trains) {

		boolean needIteration = true;
		while (needIteration) {
			needIteration = false;

			for (int i = 1; i < trains.size(); i++) {
				if (trains.get(i).getTrainNumber() < trains.get(i - 1).getTrainNumber()) {
					swap(trains, i, i - 1);
					needIteration = true;

				}
			}
		}
		return trains;

	}

	private void swap(ArrayList<Train> trains, int i, int j) {
		Train tmp = new Train(trains.get(i).getPointName(), trains.get(i).getTrainNumber(),
				trains.get(i).getDepartTime());
		trains.get(i).setTrain(trains.get(j).getPointName(), trains.get(j).getTrainNumber(),
				trains.get(j).getDepartTime());
		trains.get(j).setTrain(tmp.getPointName(), tmp.getTrainNumber(), tmp.getDepartTime());

	}

	public ArrayList<Train> sortByPointName(ArrayList<Train> trains) {

		boolean needIteration = true;
		while (needIteration) {
			needIteration = false;
			for (int i = 1; i < trains.size(); i++) {
				int num = trains.get(i).getPointName().compareTo(trains.get(i - 1).getPointName());
				if (num < 0) {
					swap(trains, i, i - 1);
					needIteration = true;
				}
			}
		}
		return trains;
	}

	public ArrayList<Train> sortByDepartTime(ArrayList<Train> trains) {

		boolean needIteratoin = true;
		while (needIteratoin) {
			needIteratoin = false;
			for (int i = 1; i < trains.size(); i++) {
				int num = trains.get(i).getDepartTime().compareTo(trains.get(i - 1).getDepartTime());
				if (num < 0) {
					swap(trains, i, i - 1);
					needIteratoin = true;
				}
			}
		}
		return trains;
	}

	private ArrayList<Train> sortByDepartTime(ArrayList<Train> trains, int start, int end) {

		boolean needIteratoin = true;
		while (needIteratoin) {
			needIteratoin = false;

			for (int i = start; i < end; i++) {
				int num = trains.get(i).getDepartTime().compareTo(trains.get(i + 1).getDepartTime());
				if (num > 0) {
					swap(trains, i, i + 1);
					needIteratoin = true;
				}
			}
		}
		return trains;
	}

	public ArrayList<Train> sortByPointNameAndDepartTime(ArrayList<Train> trains) {

		ArrayList<Train> sortListByPointName = sortByPointName(trains);
		List<Integer> startEnd = new ArrayList<Integer>();
		int pointNameCounter = 1;

		for (int i = 0; i < sortListByPointName.size() - 1; i++) {
			if (sortListByPointName.get(i).getPointName().equals(sortListByPointName.get(i + 1).getPointName())) {
				pointNameCounter++;
				if (pointNameCounter == 2) {
					startEnd.add(i);
				}
			} else {

				if (pointNameCounter > 1) {
					startEnd.add(i);
				}
				pointNameCounter = 1;
			}
		}

		for (int i = 0; i < startEnd.size();) {

			sortByDepartTime(trains, startEnd.get(i), startEnd.get(i + 1));
			i += 2;
		}

		return trains;
	}
}
