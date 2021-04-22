package by.htp.task02.entity;

import java.util.Date;

public class Train {

	private String pointName;
	private int trainNumber;
	private Date departTime;

	public Train() {
	}

	public Train(String pointName, int trainNumber, Date departTime) {
		this.pointName = pointName;
		this.trainNumber = trainNumber;
		this.departTime = departTime;

	}

	public void setTrain(String pointName, int trainNumber, Date departTime) {
		setTrainNumber(trainNumber);
		setPointName(pointName);
		setDepartTime(departTime);
	}

	public String getPointName() {
		return pointName;
	}

	public void setPointName(String pointName) {
		this.pointName = pointName;
	}

	public int getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}

	public Date getDepartTime() {
		return departTime;
	}

	public void setDepartTime(Date departTime2) {
		this.departTime = departTime2;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((departTime == null) ? 0 : departTime.hashCode());
		result = prime * result + ((pointName == null) ? 0 : pointName.hashCode());
		result = prime * result + trainNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		if (departTime == null) {
			if (other.departTime != null)
				return false;
		} else if (!departTime.equals(other.departTime))
			return false;
		if (pointName == null) {
			if (other.pointName != null)
				return false;
		} else if (!pointName.equals(other.pointName))
			return false;
		if (trainNumber != other.trainNumber)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Train [pointName=" + pointName + ", trainNumber=" + trainNumber + ", departTime=" + departTime + "]";
	}

}