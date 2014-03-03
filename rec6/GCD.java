public class GCD {
	public static void main(String args[]) {
		int n = IO.readInt(), m = IO.readInt();	
		if ( n <= 0 || m <= 0) {
			System.out.println("Non positive integers entered.");
			System.exit(1);
		}
		int d = 1;
		for (int i = Math.max(n,m)/2; i >= 1; i--) {
			if (n % i == 0 && m % i == 0) {
				d = i;
				break;
			}
		}
		System.out.println(d);
	}
}
