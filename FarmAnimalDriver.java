/*
 * Denny To
 * HW2 - P1
 */

package abstractFarmAnimal;

public class FarmAnimalDriver {
	
	public static void main(String[] args) {
		
		// Polymorphism - creating objects of defined type FarmAnimal but of actual types Cow and Chicken
		FarmAnimal cow = new Cow("Male", 10, 13.45, false, "Aggressive");
		FarmAnimal cw = new Cow("Female", 5, 9.5, true, "Shy");
		FarmAnimal chick = new Chicken("Female", 2, 2.75, true);
		FarmAnimal chck = new Chicken("Male", 9, 5.95, false);
		FarmAnimal ck = new Chicken("Female", 7, 5.75, false);
		
		FarmAnimal[] FarmAnimals = {cow, cw, chick, chck, ck}; // array of defined type FarmAnimal
		
		System.out.println("------------------------\nFarm Animals: \n------------------------");
		
		for (int i = 0; i < FarmAnimals.length; i++) {// for-loop for printing
			System.out.print(FarmAnimals[i]);// prints object cow from FarmAnimals array via toString
			FarmAnimals[i].makeNoise();// object cow from FarmAnimals array makes a noise
			FarmAnimals[i].howToEat();
		}
		
		System.out.println("------------------------\nEdible: \n------------------------");
		
		Edible ba = new Banana(false);
		Edible b = new Banana(true);
		
		Edible[] HaoChi = {cow, chick, b, ba};
		
		for (int i = 0; i < HaoChi.length; i++) {
			System.out.print(HaoChi[i]);
			HaoChi[i].howToEat();
		}
	}

}
