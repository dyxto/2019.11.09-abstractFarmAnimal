package abstractFarmAnimal;

public class Banana implements Edible {
	
	private boolean isRipe;

	public Banana(boolean isRipe) {
		
		this.isRipe = isRipe;
	}
	
	public String toString() {
		
		return "New: Banana\nIs Ripe: " + isRipe + "\n";
		
	}

	@Override
	public void howToEat() {
		
		System.out.println("How to eat: Peel it\n");
	}

}
