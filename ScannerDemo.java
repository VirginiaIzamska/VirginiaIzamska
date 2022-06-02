import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How much money do you have? ");
		double money = sc.nextDouble();

		System.out.println("Happy li si be?");
		boolean isHappy = sc.nextBoolean();

		if(money >= 15 || isHappy) {
			System.out.println("otiam na kino");
		} else {
			System.out.println("depresiq");
		}
	}

}
