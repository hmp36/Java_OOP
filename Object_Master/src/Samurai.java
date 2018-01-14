
public class Samurai extends Human{

    private static int instanceCounter = 0;

    public Samurai(){
        super();
        setHealth(200);
        instanceCounter++;
    }

    public void deathBlow(Human victim) {
        System.out.println("Samurai casts death blow...");
        // kill victim
        victim.setHealth(0);
        System.out.println("Victim's health is: " + victim.getHealth() + ". RIP...");

        //reduce Samurai health to half
        int currentSamuraiHealth = this.getHealth();
        this.setHealth(currentSamuraiHealth/2);
        System.out.println("Samurai's new health is: " + this.getHealth());
    }

    public void meditate() {
        // heal Samurai for half of their current health
        int currentSamuraiHealth = this.getHealth();
        this.setHealth(currentSamuraiHealth/2 + currentSamuraiHealth);
        System.out.println("Samurai's new health is : " + this.getHealth());
    }

    public static int howMany() {
        System.out.println("There are currently " + instanceCounter + " samurai(s).");
        return instanceCounter;
    }

}