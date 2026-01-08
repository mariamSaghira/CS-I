import java.util.Scanner;

public class Groceries {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How many times do you go to the grocery store each week?");
		int g = in.nextInt();
		System.out.println("Money?");
		double s = in.nextDouble();
		System.out.printf("This week you spent $%.2f on groceries.", g*s);
	}
}
