public class Sudoku {
	public static void main(String args[]) {
		int[][] a = { {2, 4, 8, 3, 9, 5, 7, 1, 6}, 
			{5, 7, 1, 6, 2, 8, 3, 4, 9},
			{9, 3, 6, 7, 4, 1, 5, 8, 2},
			{6, 8, 2, 5, 3, 9, 1, 7, 4},
			{3, 5 ,9, 1, 7, 4, 6, 2, 8},
			{7, 1, 4, 8, 6, 2, 9, 5, 3},
			{8, 6, 3, 4, 1, 7, 2, 9, 5},
			{1, 9, 5, 2, 8, 6, 4, 3, 7},
			{4, 2, 7, 9, 5, 3, 8, 6, 1}
		};
		//Check every row
		for (int i = 0; i < a.length; i++){
			boolean[] seen = new boolean[9];
			for (int j = 0; j < a[i].length; j++) {
				if (seen[a[i][j]-1]) {
					System.out.println("Not a valid answer");
					return;
				}
				seen[a[i][j]-1] = true;
			}
		}
		//Check every column
		for (int j = 0; j < a[0].length; j++) {
			boolean[] seen = new boolean[9];
			for (int i = 0; i < a.length; i++){
				if (seen[a[i][j]-1]) {
					System.out.println("Not a valid answer");
					return;
				}
				seen[a[i][j]-1] = true;
			}
		}
		
		for (int i = 0 ; i < a.length; i+=3) {
			for (int j = 0; j < a[i].length; j+=3) {
				boolean[] seen = new boolean[9];
				for (int x = i; x < i+3; x++) {
					for (int y = j; y < j+3; y++) {
						if (seen[a[x][y]-1]) {
							System.out.println("Not a valid answer!!!");
							return;
						}
						seen[a[x][y]-1] = true;				
					}
				}
			}
		}
		
		System.out.println("Valid answer");
	}
}
