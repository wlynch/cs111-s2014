public class Hand {
	int[] val;
	char[] face;
	public Hand() {
		val = new int[5];
		face = new char[5];
	}

	public Hand(int[] val, char[] face) {
		this();
		for (int i = 0; i < this.val.length; i++) {
			this.val[i] = val[i];
			this.face[i] = face[i];
		}
	}
	
	public boolean hasFlush() {
		for (int i = 0; i < val.length-1; i++) {
			if (face[i] != face[i+1]) {
				return false;
			}
		}
		return true;
	}

	private void sortByValue() {
		//selection sort
		for (int i = 0; i < val.length; i++) {
			int min = i;
			for (int j = i; j < val.length; j++) {
				if (val[j] < val[min]) {
					min = j;
				}
			}
			int swap = val[i];
			val[i] = val[min];
			val[min] = swap;
			char suitSwap = face[i];
			face[i] = face[min];
			face[min] = suitSwap;
		}
	}

	public boolean hasStraight() {
		sortByValue();
		for (int i = 0; i < val.length-1; i++) {
			if (val[i] != val[i+1]-1) {
				return false;
			}
		}
		return true;
	}

	public boolean hasNOfM(int n, int m) {
		int[] a = new int[13];
		for (int i = 0; i < val.length; i++) {
			a[val[i]-1]++;
		}
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == m) {
				count++;
			}
		}
		return count == n;
	}

	public boolean hasOnePair() {
		return hasNOfM(1,2);
	}

	public boolean hasTwoPair() {
		return hasNOfM(2,2);
	}

	public boolean hasThreeOfAKind() {
		return hasNOfM(1,3);
	}
}
