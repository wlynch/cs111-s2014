

public class StringTest {

	public static boolean foo(String a, String b) {
		b = "hello";
		return a==b;
	}

	public static String bar() {
		return "hello";
	}

	public static void main(String args[]) {
		String a = "hello";
		String b = "bye";
		String c = a;
		String d = c;
		String e = "hello";
		e ="asdf";

		System.out.println(a + "," + e);

		System.out.println(a==b);
		System.out.println(a==e);
		System.out.println(c==a);
		System.out.println(a.equals(e));
		System.out.println(d==a);
		System.out.println(c.equals(e));
		System.out.println(foo(a,e));
		System.out.println(a == bar());
	}
}
