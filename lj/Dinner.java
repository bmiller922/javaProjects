package lj;

class Dinner {
	
	private void makeNoodles(Noodle noodle, String sauce) {
		
		noodle.cook();
		
		System.out.println("Mixing " + noodle.texture + " noodles made from " +
		noodle.ingredients + " with " + sauce + ".");
		System.out.println("Dinner is served!");
		
	}
	
	public static void main(String[] args) {
		
		Dinner noodlesDinner = new Dinner();
		//BiangBiang biangBiang = new BiangBiang();
		Noodle biangBiang = new BiangBiang();
		//these two instantiates do the same thing, bc of inheritance/polymorphism between child class/parent class
		noodlesDinner.makeNoodles(biangBiang, "soy sauce and chili oil");
		
	}

}
