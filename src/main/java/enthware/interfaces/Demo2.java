package enthware.interfaces;

interface House {
	public default String getAddress() {
		return "101 Main Str";
	}
}

interface Bungalow extends House {
	public default String getAddress() {
		return "101 Smart Str";
	}
}

class MyHouse implements Bungalow, House {
}

public class Demo2 {

	public static void main(String[] args) {
		MyHouse ci = new MyHouse();  //1     
		System.out.println(ci.getAddress()); //2
	}

}
