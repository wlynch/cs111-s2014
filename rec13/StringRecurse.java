
public class StringRecurse {

	public static String reverse(String s) {
		if (s.length() == 0) {
			return "";
		}
		return reverse(s.substring(1)) + s.charAt(0);
	}

	public static void foo(int x) {
		foo(x,0);
	}

	private static void foo(int x, int i) {
		if (i >= x) 
			return;
		i++;
	}

	public static boolean isPalindrome(String s) {
		if (s.length() == 1 || s.length() == 0) {
			return true;
		}
		if (s.charAt(0) != s.charAt(s.length()-1)){
			return false;
		}
		return isPalindrome(s.substring(1, s.length()-1));
	}

	public static int binarySearch(int[] arr, int target) {
		return binarySearch(arr, target, 0, arr.length-1);
	}

	private static int binarySearch(int[] arr, int target, int min, int max) {
		if (max < min) {
			return -1;
		}
		int mid = (max + min) / 2;
		if (arr[mid] == target) {
			return mid;
		} else if (arr[mid] < target) {
			return binarySearch(arr, target, mid+1, max);
		} else {
			return binarySearch(arr, target, min, mid-1);
		}
	}

	public static void main(String args[]) {
		System.out.println(reverse("string"));	
		System.out.println(reverse("asdfg"));	
		System.out.println(reverse("a"));	
		System.out.println("["+reverse("")+"]");	
		System.out.println(isPalindrome("racecar"));	
		System.out.println(isPalindrome("asdf"));	
		System.out.println(isPalindrome("a"));	
		System.out.println(isPalindrome(""));	


		int[] arr = {1,2,3,4,5};
		System.out.println(binarySearch(arr, 4));
		System.out.println(binarySearch(arr, 6));
	}
}
