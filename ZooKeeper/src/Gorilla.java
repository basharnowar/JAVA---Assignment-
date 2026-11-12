
public class Gorilla extends ZooKeeper {
	
	public Integer throwSomething() {
		this.energyLevel -= 5;
		return energyLevel;
		
	}
	
	
	public Integer eatBanana() {
		this.energyLevel += 10;
		return energyLevel;
	}
	
	public Integer climb() {
		this.energyLevel -= 10;
		return energyLevel;
	}
}
