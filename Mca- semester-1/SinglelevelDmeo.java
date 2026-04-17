class Animal{
		public void eat() {
		System.out.println("Animal can be veg. or non veg");
	}
		public void show() {
			System.out.println("Represents animal");
		}
}
class Cow extends Animal{
		public void eat() {
		System.out.println("Cows are veg.");
	}
}

public class SinglelevelDmeo {
	public static void main(String[] args) {
		Cow c = new Cow();
		c.eat(); //call cow class method bcaz Animal class eat() method has been overridden 
		c.show();
		}

}
