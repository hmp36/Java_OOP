
public class Ninja extends Human{
	
	public void ninja() {
		setHealth(getHealth() + 200);
	}
	
	
	public Ninja(){
        super();
        setStealth(10);
    }

			
    public Ninja steal(Human victim){
       int currentNinjaStealth = this.getStealth();
       int currentNinjaHealth = this.getHealth();
       int victimHealth = victim.getHealth();
       int victimNewHealth = victimHealth - currentNinjaStealth;
       int ninjaNewHealth = currentNinjaHealth + currentNinjaStealth;
//       
       
       setHealth(getHealth() +50);
       System.out.println("Ninja drains life force.......");
       System.out.println("Victim weakened to " + victimNewHealth);
       System.out.println("Ninja stregthened; health increased to " + ninjaNewHealth);
       return this;
    }

    public void runAway(){
        int currentNinjaHealth = this.getHealth();
        int newNinjaHealth = currentNinjaHealth - 10;
        
        System.out.println("Ahhh, I'm outta here..Ninja ran away. Health is now: " + newNinjaHealth);
    }
}


