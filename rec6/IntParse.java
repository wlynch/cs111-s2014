public class IntParse {
	public static void main(String args[]) {
		int n = IO.readInt();
		int i = 1;
		// Find largest power of 10
		while (n >= i) {
			i*=10;
		}
		// Divide and mod numbers and print
		while (n > 0) {
			i/=10;
			System.out.println(n/i);
			n = n % i;
		}
	}
}
