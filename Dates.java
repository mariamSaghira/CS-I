import java.util.Scanner;

public class Dates {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.printf("What is the day of the week?\n");
		String dayWeek = in.nextLine();

		System.out.printf("What is the month?\n");
		String month = in.nextLine();

		System.out.printf("What is the day of the month?\n");
		String dayMonth = in.nextLine();

		System.out.printf("What is the year?\n");
		String year = in.nextLine();

		printAmerican(dayWeek, month, dayMonth, year);
		printEuropean(dayWeek, month, dayMonth, year);
	}

	public static void printAmerican(String dayWeek, String month, String dayMonth, String year) {
		 System.out.println("American format: " + dayWeek + ", " + month + " " + dayMonth + ", " + year);
	}
	public static void printEuropean(String dayWeek, String month, String dayMonth, String year) {
		System.out.println("European format: " + dayWeek + " " + dayMonth + " " + month + " " + year);
	}
}
