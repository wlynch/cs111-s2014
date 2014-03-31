
import java.util.Arrays;

public class Rec9 {

	public static boolean isPalindrome(String str) {
		for (int i = 0; i < str.length()/2; i++) {
			if (str.charAt(i) != str.charAt(str.length()-i-1)) {
				return false;
			}
		}
		return true;
	}

	private static String sortChars(String s) {
		char[] arr = s.toCharArray();
		Arrays.sort(arr);
		return Arrays.toString(arr);
	}

	public static boolean isAnagramSort(String a, String b) {
		return sortChars(a).equals(sortChars(b));
	}

	public static boolean isAnagram(String a, String b) {
		a = a.toLowerCase();
		b = b.toLowerCase();
		char[] arr1 =  new char[128], arr2 = new char[128];
		for (int i = 0 ; i < a.length(); i++) {
			arr1[a.charAt(i)]++;
		}
		for (int i = 0 ; i < b.length(); i++) {
			arr2[b.charAt(i)]++;
		}
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;
	}

	public static String longestSubsequence(String s) {
		int subseqLength = 1, subseqIndex = 0;
		int maxSubseqLength = 1, maxSubseqIndex = 0; 
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == s.charAt(i-1)) {
				subseqLength++;
			} else {
				if (subseqLength > maxSubseqLength) {
					maxSubseqLength = subseqLength;
					maxSubseqIndex = subseqIndex;
				}
				subseqIndex = i;
				subseqLength = 1;
			}
		}
		return s.substring(maxSubseqIndex, maxSubseqIndex + maxSubseqLength);
	}

	public static void main(String args[]) {
		// String s = IO.readString();
		System.out.println(isPalindrome("racecar"));
		System.out.println(isPalindrome("revolver"));
		System.out.println(isAnagram("listen", "silen"));
		System.out.println(longestSubsequence("abaabacccaabbbba"));

	}
}
