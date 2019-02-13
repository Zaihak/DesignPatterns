package strategydesignpattern;

public class AnimalPlay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal sparky = new Dog();
		Animal tweety = new Bird();
		
		System.out.println("Dog: " + sparky.tryToFly());
		
		System.out.println("Bird: " + tweety.tryToFly());
		
		// This allows dynamic changes for flyingType
		
		sparky.setFlyingAbility(new ItsFly());
		
		System.out.println("Dog: " + sparky.tryToFly());

	}

}
