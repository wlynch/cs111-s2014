public class Poker {
	public static void main(String args[]) {
		Hand h = new Hand(new int[]{1,2,3,4,5}, new char[]{'s', 's', 's', 's', 's'});
		System.out.println(h.hasFlush());

		Hand h1 = new Hand(new int[]{1,2,3,4,5}, new char[]{'s', 's', 's', 's', 'h'});
		System.out.println(h1.hasFlush());
		

		System.out.println("Straight:");
		Hand h2 = new Hand(new int[]{1,2,3,4,5}, new char[]{'s', 's', 's', 's', 'h'});
		System.out.println(h2.hasStraight());
		Hand h3 = new Hand(new int[]{5,4,3,2,1}, new char[]{'s', 's', 's', 's', 'h'});
		System.out.println(h3.hasStraight());
		Hand h4 = new Hand(new int[]{3,2,8,5,4}, new char[]{'s', 's', 's', 's', 'h'});
		System.out.println(h4.hasStraight());
		

		Hand h5 = new Hand(new int[]{3,2,8,5,4}, new char[]{'s', 's', 's', 's', 'h'});
		System.out.println(h5.hasOnePair());
		Hand h6 = new Hand(new int[]{3,2,8,3,4}, new char[]{'s', 's', 's', 's', 'h'});
		System.out.println(h6.hasOnePair());
	}
}
