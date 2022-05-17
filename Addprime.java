package array;

public class Addprime {

	public static void main(String[] args) {

		int[] a = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };

		for (int i = 0; i < a.length; i++) {

			if (isPrimeNum(a[i])) {
				System.out.println(a[i]);
			}
		}

	}

	static boolean isPrimeNum(int num) {

		if (num == 0 || num == 1 || num == 2) {
			return false;
		} else {
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					return false;
				}
			}
			return true;
		}
	}

}