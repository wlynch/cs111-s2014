//
public class ArrayManip {
	public static void main(String args[]) {
		int[] a = {1, 2, 3, 4};
		//int[] a = {1000, -2, 4, 7, 15};

		for (int i = 0; i < a.length/2; i++) {
			int tmp = a[i];
			a[i] = a[(a.length-1)-i];	
			a[(a.length-1)-i] = tmp;
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
}
