package carRent;

import java.util.Scanner;

public class system {
	public static void main(String[] args) {
		System.out.println("\t\t*************************");
		System.out.println("\t\tWelcom to car rent system");
		System.out.println("\t\t*************************");
		System.out.println("which kind do you want?1:saloonCar 2:bus");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		if (n == 1) {
			saloonCar a = new saloonCar();
			a.setKind("宝马");
			a.setMoney(500);
			a.setNumber("鲁A001");
			System.out.println("Carkind:" + a.getKind() + ",Money:" + a.getMoney() + "one day");
			System.out.println("You like? Do you want this? y/n?");
			String ret = input.next();
			if (ret.equalsIgnoreCase("y")) {
				System.out.println("How mamy days do you want to rent?");
				int day = input.nextInt();
				double sum = a.carMoney(day);
				System.out.println("You will pay " + sum + " for all");
				System.out.println("The number of car is:" + a.getNumber() + "\nThink you for chose us~");

			} else
				System.out.println("Think you!");
		} else {
			bus b = new bus();
			b.setSeatNum(16);
			b.setMoney(1500);
			b.setNumber("鲁A002");
			System.out.println("Seatnum:" + b.getSeatNum() + ",Money:" + b.getMoney() + "one day");
			System.out.println("You like? Do you want this? y/n?");
			String ret = input.next();
			if (ret.equalsIgnoreCase("y")) {
				System.out.println("How mamy days do you want to rent?");
				int day = input.nextInt();
				double sum = b.carMoney(day);
				System.out.println("You will pay " + sum + " for all");
				System.out.println("The number of car is:" + b.getNumber() + "\nThink you for chose us~");

			} else
				System.out.println("Think you!");

		}
	}
}
