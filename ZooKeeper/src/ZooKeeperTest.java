
public class ZooKeeperTest extends ZooKeeper {

	public static void main(String[] args) {
		ZooKeeper zoo = new ZooKeeper();
		
		Integer Gorilla1 = zoo.displayEnergy();
		System.out.println("This is my energy level " + Gorilla1);

	}

}
