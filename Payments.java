public class Payments {
	public static void pay(int hours, double basePay) {
		if(hours > 60) {
			System.out.printf("Error\n");
		} else if(basePay < 15) {
			System.out.printf("Error\n");
		} else if(hours <= 40){
			double value = hours * basePay;
			System.out.printf("Total salary: $%.2f\n", value);
		} else if(hours <= 60) {
			double value = (hours-40)*1.5*basePay+40*basePay;
			System.out.printf("Total salary: $%.2f\n", value);
		}
	}

	public static void main(String[] args) {
		pay(48, 22.50);
		pay(38, 14.90);
		pay(70, 30.92);
		pay(29, 16.75);
	}
}
