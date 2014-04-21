public class Pointers {
	public static void foo(int x) {
		x += 100;
	}

	public static void add5(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] += 5;
		}
	}

	public static void main(String args[]) {
		int x = 0;

		foo(x);
		System.out.println(x);

		int[] a = {1,2,3,4};
		add5(a);
		for (int b: a) {
			System.out.print(b + " ");
		}
		System.out.println();

		Object o = new Object();

		System.out.println(o == null);
		System.out.println(o.equals(null));
	}
}
