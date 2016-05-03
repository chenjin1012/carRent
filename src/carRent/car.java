package carRent;

public abstract class car {
	private String number;
	private double money;

	public double carMoney(int day) {
		double sum;
		sum = day * getMoney();
		// TODO Auto-generated method stub
		return sum;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

}
