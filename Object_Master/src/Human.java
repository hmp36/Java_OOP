
public class Human {

	private int Health = 100;
	private int str = 3;
	private int Stealth = 3;
	private int intel = 3;
	
	public int displayHealth() {
		System.out.println("Health: " + getHealth());
		return getHealth();
	}
	
	public void attack(Human man){
        int damage = this.str;
        man.setHealth(getHealth()-damage);
        System.out.println("You viciously attack the enemy for " + str + " Damage.");
        System.out.println("They now have " + man.getHealth() + " Health.");

	}
        
    	public int getIntel() {
    		return intel;
    	}

    	
    	public void setIntel(int intel) {
    		this.intel = intel;
    	}

    	
    	public int getStealth() {
    		return Stealth;
    	}

    	
    	public void setStealth(int stealth) {
    		this.Stealth = stealth;
    	}

    	
    	public int getHealth() {
    		return Health;
    	}

    	
    	public void setHealth(int health) {
    		this.Health = health;
    	}
    }   
        
        
        
   
        
        
        
   
	
	
	
	
	
	
	

