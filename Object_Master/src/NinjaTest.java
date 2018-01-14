
public class NinjaTest {
	
	
	public static void main(String[] args) {
		Ninja n = new Ninja();
		Human Bob = new Human();
		Wizard Hagan = new Wizard(); 
		 
		n.ninja();
		n.steal(Bob);n.steal(Bob);n.steal(Bob);n.runAway();
		n.displayHealth();
		
		Bob.attack(n);
		Bob.displayHealth();
		
		Hagan.fireball(Bob);Hagan.fireball(Bob);Hagan.fireball(Bob);Bob.displayHealth();

		
		
		
	}

}

	
	
	

