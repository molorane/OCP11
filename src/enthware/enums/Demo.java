package enthware.enums;

enum Coffee {
	ESPRESSO("Very Strong"), MOCHA("Bold"), LATTE("Mild");

	public String strength;

	Coffee(String strength) {
		this.strength = strength;
	}
	
	public String toString(){
		//return String.valueOf(Coffee.ESPRESSO); // stackoverflow
		return String.valueOf(strength);
	}
}

public class Demo {

	public static void main(String[] args) {
		System.out.println(Coffee.ESPRESSO.toString());
	}

}
