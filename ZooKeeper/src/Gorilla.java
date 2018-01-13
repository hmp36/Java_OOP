
public class Gorilla extends Mammal {
	public Gorilla throwSomething() {
	    	setEnergyLevel(getEnergyLevel() -5);
	    	System.out.println("Gorilla threw poop and lost 5 energy");
	    	return this;
	}
	public Gorilla eatBananas() {
			setEnergyLevel(getEnergyLevel() +10);
			System.out.println("Gorilla ate a Banana and gained 10 energy");
			return this;
	}
	public Gorilla climb() {
			setEnergyLevel(getEnergyLevel() -10);
			System.out.println("Gorilla climbed a tree and lost 10 energy");
			return this;
	}

}

