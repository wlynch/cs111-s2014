
public class MethodTest {
	
	public static void a(String s) {
		s = "Asdf";
	}

	public static void b(int[] a) {
		a[0] = 5;
	}
	
	public static void main(String args[]) {
		String x = "qwer";
		int[] y = { 0, 0 };

		a(x);
		b(y);

		System.out.println(x);
		for (int i = 0; i < y.length; i++) {
			System.out.print(y[i] + " ");
		}
		System.out.println();
	}
}
