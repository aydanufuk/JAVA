
public class LargeFactorial {

	public static void largeFactorial(int n) {

		int result[] = new int[500];
		result[0] = 1;
		int result_size = 1;

		for (int idx = 2; idx <= n; idx++) {
			result_size = multiplyLarge(idx, result, result_size);
		}

		System.out.println("Factorial of given number is: ");

		for (int idx = result_size - 1; idx >= 0; idx--) {
			System.out.print(result[idx]);
		}
		System.out.println();
	}

	public static int multiplyLarge(int x, int result[], int result_size) {
		int carry_ = 0;

		for (int idx = 0; idx < result_size; idx++) {
			int product = result[idx] * x + carry_;
			result[idx] = product % 10;
			carry_ = product / 10;
		}

		while (carry_ != 0) {
			result[result_size] = carry_ % 10;
			carry_ = carry_ / 10;
			result_size++;
		}
		return result_size;
	}

	public static void main(String[] args) {
		largeFactorial(50);
		largeFactorial(100);
	}
}
