/*
 * Denny To
 * HW2 - P1
 */

package abstractFarmAnimal;

public abstract class FarmAnimal implements Edible { // farm animals are edible\
	
	private String gender;
	private int age;
	private double weight;

	public FarmAnimal(String gender, int age, double weight) {
		
		this.setGender(gender);
		this.setAge(age);
		this.setWeight(weight);
		
	}
	
	public abstract void makeNoise(); // gets overrided
	
	public String getAnimal() {return gender;}

	public String getGender() {return gender;}

	public void setGender(String gender) {this.gender = gender;}

	public int getAge() {return age;}

	public void setAge(int age) {this.age = age;}

	public double getWeight() {return weight;}

	public void setWeight(double weight) {this.weight = weight;}

	public void howToEat() {System.out.println("How to eat: Inhale deeply\n");}


}