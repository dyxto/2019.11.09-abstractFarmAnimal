/*
 * Denny To
 * HW2 - P1
 */

package abstractFarmAnimal;

public class Cow extends FarmAnimal { // cows are farm animals which are edible (so 'implements Edible' is not needed because of Inheritance)
	
	private boolean isDairyCow;
	private String temperament;
	
	public Cow(String gender, int age, double weight, boolean isDairyCow, String temperament) {
		
		super(gender, age, weight);
		
		this.isDairyCow = isDairyCow;
		this.temperament = temperament;
	}

	@Override
	public void makeNoise() {
		
		System.out.println("Says: Moo Moo");
	}
	
	public String toString() {
		
		return "New: Cow\nGender: " + getGender() + "\nAge: " + getAge() + "\nWeight: " + getWeight() + "\nIs a Dairy Cow: " + isDairyCow + "\nTemperament: " + temperament + "\n";
		
	}

	@Override
	public void howToEat() {
		
		System.out.println("How to eat: Sear it\n");
	}
	
}
