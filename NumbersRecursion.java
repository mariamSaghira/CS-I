public class NumbersRecursion {

	public static void previousEven(int x) {
		if(x % 2 == 0) {
			System.out.print(x + " ");
		}
		if(x > 1) {
			previousEven(x-1);
		}
	}

	public static int productOfPreviousOdd(int y) {
		if(y % 2 == 1 && y > 1) {
			return y * productOfPreviousOdd(y-1);
		}
		if(y == 1) {
			return y;
		}
		if(y % 2 == 0 && y > 1) {
			return productOfPreviousOdd(y-1);
		} else {
			return 0;
		}
	}

	public static int sumOfPreviousN(int x, int y) {
		if(x-y > 0) {
			return (x-y) + sumOfPreviousN(x-y, y);
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		previousEven(6);
		System.out.println();
		System.out.println(productOfPreviousOdd(10));
		System.out.println(sumOfPreviousN(20,6));
	}
}

