/*
 * Denny To
 * HW2 - P1
 */

package abstractFarmAnimal;

public class Chicken extends FarmAnimal { // cows are farm animals which are edible (so 'implements Edible' is not needed because of Inheritance)
	
	private boolean carriesBirdFlu;
	
	public Chicken(String gender, int age, double weight, boolean carriesBirdFlu) {
		
		super(gender, age, weight);
		
		this.carriesBirdFlu = carriesBirdFlu;
		
	}

	@Override
	public void makeNoise() {
		
		System.out.println("Says: Bok Bok");
	}
	
	public String toString() {
		
		return "New: Chicken\nGender: " + getGender() + "\nAge: " + getAge() + "\nWeight: " + getWeight() + "\nCarries Bird Flu: " + carriesBirdFlu +"\n";
		
	}

	@Override
	public void howToEat() {
		
		System.out.println("How to eat: Fry it\n");
	}
	
}
