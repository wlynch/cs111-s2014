public class Average {
	public static void main(String args[]) {
		System.out.print("Please enter how many numbers: ");
		int n = IO.readInt();
		if (n <= 0) {
			System.out.println("You must enter a number greater than 0");
			System.exit(1);
		}

		int[] a = new int[n];
		// Read in numbers
		for (int i = 0; i < n; i++) {
			a[i] = IO.readInt();
		}
		
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += a[i];
		}

		System.out.println((double)sum/n);
	}
}
