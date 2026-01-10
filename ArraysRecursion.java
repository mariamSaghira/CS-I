public class ArraysRecursion {
	public static boolean isPalindromeHelper(int i, int n, char[] chars) {
		if(i < n){
			if(chars[i] == chars[n]){
				i++;
				n--;
				return isPalindromeHelper(i, n, chars);
			} else {
				return false;
			}
		}

		if(i == n) {
			if(chars[i] == chars[n]) {
				return true;
			}
		}return false;
	}

	public static boolean isPalindrome(char[] chars) {
		return isPalindromeHelper(0, chars.length-1, chars);
	}

	public static boolean isPalindromeHelper(int i, int n, int[] nums) {
		if(i < n){
			if(nums[i] == nums[n]){
				i++;
				n--;
				return isPalindromeHelper(i, n, nums);
			} else {
				return false;
			}
		}

		if(i == n) {
			if(nums[i] == nums[n]) {
				return true;
			}
		} return false;
	}

	public static boolean isPalindrome(int[] nums){
		return isPalindromeHelper(0, nums.length-1, nums);
	}

	public static boolean isSortedHelper(int i, int[] nums, boolean x) {
		if(i == nums.length-1) {
			return true;
		}
		if(x == true && nums[i] < nums[i+1]) {
			return isSortedHelper(i+1, nums, x);
		}

		if(x == false && nums[i] > nums[i+1]) {
			return isSortedHelper(i+1, nums, x);
		}
		return false;
	}

	public static boolean isSorted(int[] nums, boolean x) {
		return isSortedHelper(0, nums, x);
	}

	public static String removeLettersHelper(int i, int n, String s, char[] letters) {
		if(i < s.length()) {
			if(s.charAt(i) == letters[n]) {
				return removeLettersHelper(i, n, s.substring(0,i) + "" + s.substring(i+1), letters);
			} else if(s.charAt(i) == letters[n+1]){
				return removeLettersHelper(i, n, s.substring(0,i) + "" + s.substring(i+1), letters);
			} else {
				return removeLettersHelper(i+1, n, s, letters);
			}
		} else {
			return s;
		}
	}

	public static String removeLetters(String s, char[] letters) {
		return removeLettersHelper(0, 0, s, letters);
	}

	public static int countOccurrencesHelper(int n, int i, int[] nums, int x){
		if(i < nums.length && nums[i] == x) {
			return countOccurrencesHelper(n+1, i+1, nums, x);
		} else if(i < nums.length && nums[i] != x) {
			return countOccurrencesHelper(n, i+1, nums, x);
		} else {
			return n;
		}
	}

	public static int countOccurrences(int[] nums, int x) {
		return countOccurrencesHelper(0, 0, nums, x);
	}

	public static void powerHelper(int i, int n, double[] oldArr, double[] newArr) {
		if(i < newArr.length) {
			newArr[i] = pow(oldArr[i], n);
			powerHelper(i+1, n, oldArr, newArr);
		}
	}

	public static double pow(double x, int n) {
		if(n > 0) {
			return x * pow(x, n-1);
		} else {
			return 1;
		}
	}

	public static double[] power(double[] oldArr, int n) {
		double[] newArr = new double[oldArr.length];
		powerHelper(0, n, oldArr, newArr);
		return newArr;
	}

	public static void main(String[] args) {
		char[] chars = {'m','a','d','a','m'};
		System.out.println(isPalindrome(chars));
		int[] nums = {1,2,3,2,1};
		System.out.println(isPalindrome(nums));
		int[] n = {1,2,3,4,5};
		System.out.println(isSorted(n, true));
		char[] letters = {'c','y'};
		System.out.println(removeLetters("accompany", letters));
		int[] ints = {1,2,3,2,4,2};
		System.out.println(countOccurrences(ints, 2));
		double[] oldArr = {2,3,5};
		double[] newArr = power(oldArr, 3);
		System.out.println(newArr[0] + ", " + newArr[1] + ", " + newArr[2]);
	}
}
