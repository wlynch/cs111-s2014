public class Randomizer {
	
	private static String[] roster = {
		"David", 
		"Adam", 
		"Lavender", 
		"Shruthi", 
		"Joshua", 
		"Nathaniel",
		"Harshil",
		"Danica",
		"Bill",
		"Sam"
	};

	public static String getRandomName() {
		return roster[(int)(Math.random()*roster.length)];
	}
	
	public static void main(String args[]) {
		while (true) {
			System.out.print(getRandomName());	
			try {
				System.in.read();
			} catch (Exception e) {} 
		}
	}
}
