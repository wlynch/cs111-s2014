public class MaxMin {
	public static void main(String args[]) {
		System.out.println("Enter how many numbers are in the list:"); 
		int num = IO.readInt(); 

		System.out.println("Find the minimum? (y/n)"); 
		boolean min = IO.readBoolean(); 

		int smallest = 10; 
		int biggest = 1; 

		for (int x=0; x < num; x++){ 
			int z = IO.readInt(); 
			if ( z < 1 || z > 10 ) {
				IO.reportBadInput();
				x--;
				continue;
			}

			if ( z < smallest) 
				smallest = z; 
			else if (z > biggest) 
				biggest = z; 
		} 

		if (min) 
			System.out.println(smallest); 
		else 
			System.out.println(biggest);
	}
}
