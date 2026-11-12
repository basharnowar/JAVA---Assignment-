
public class GorillaTest {

	public static void main(String[] args) {
		
		Gorilla g = new Gorilla();
		
		Integer gt = g.throwSomething();
		System.out.println("The Gorila throws a Banana! " + gt);
		
		Integer gb = g.eatBanana();
		System.out.println("fiiiireeeee " + gb);
		
		Integer gc = g.climb();
		System.out.println("The Gorilla climbed a tree " + gc);
		
		
		
		Gorilla Gorilla1 = new Gorilla();
		
		Gorilla1.throwSomething();
		Gorilla1.throwSomething();
		Gorilla1.throwSomething();
//		System.out.println(Gorilla1.displayEnergy());
		
		Gorilla1.eatBanana();
		Gorilla1.eatBanana();
//		System.out.println(Gorilla1.displayEnergy());
		
		Gorilla1.climb();
//		System.out.println(Gorilla1.displayEnergy());
		
//		System.out.println(Gorilla1.displayEnergy());
	}

}
