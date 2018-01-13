
public class Dragon extends Mammal{
	public void dragon() {
		setEnergyLevel(getEnergyLevel() + 200);
	}
	public Dragon fly() {
	    	setEnergyLevel(getEnergyLevel() -50);
	    	System.out.println("WHoosh!, Dragon flew and lost 50 energy");
	    	return this;
	}
	public Dragon eatHumans() {
			setEnergyLevel(getEnergyLevel() +25);
			System.out.println("Dragon ate some humans and gained 25 energy");
			return this;
	}
	public Dragon attackTown() {
			setEnergyLevel(getEnergyLevel() -100);
			System.out.println("Snap, crackle, pop! the town is on fire and the dragon lost 100 energy");
			return this;
	}

}


