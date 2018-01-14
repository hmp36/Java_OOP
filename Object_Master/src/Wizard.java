
public class Wizard extends Human {
    
    public Wizard(){
        super();
        setHealth(50);
        setIntel(8);
    }

    public void heal(Human woundedHuman){
        System.out.println("Healing!");
        int currentHealth = woundedHuman.getHealth();
        woundedHuman.setHealth(currentHealth + this.getIntel());
    }

    public void fireball(Human victim){
        System.out.println("From the depths of Mordor The wizard summons the Firebawlll!");
        int currentHealth = victim.getHealth();
        victim.setHealth(currentHealth - this.getIntel()*3);
    }
}
