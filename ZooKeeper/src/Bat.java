
public class Bat extends ZooKeeper {

	public Bat() {
		this.energyLevel = 300;
	}
	
	public Integer fly() {
		this.energyLevel = 50;
		System.out.println("The Bat now is Airborne.");
		return energyLevel;
		
	}
	
	public Integer eatHumans() {
		this.energyLevel = 25;
		System.out.println("Whooaaaaaaaa");
		return energyLevel;
	}
	
	public Integer attackTown() {
		this.energyLevel = 100;
		System.out.println("The Bat attacks the town");
		return energyLevel;
	}
}
