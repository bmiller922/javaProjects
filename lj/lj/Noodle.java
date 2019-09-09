package lj;

public class Noodle {
	
	protected double lengthInCentimeters;
	protected double widthIncentimeters;
	protected String shape;
	protected String ingredients;
	protected String texture = "brittle";
	
	Noodle(double lenInCent, double wthInCent, String shp, String ingr){
		
		this.lengthInCentimeters = lenInCent;
		this.widthIncentimeters = wthInCent;
		this.shape = shp;
		this.ingredients = ingr;
		
	}
	
	final public boolean isTasty() {
		
		return true;
	}
	
	public void cook() {
		
		System.out.println("Boiling");
		
		this.texture = "cooked";
		
	}
	
	public String getCookPrep() {
		
		return "Boil Noodle for 7 minutes and add sauce.";
	}
	
	public static void main(String[] args) {
		
//		Spaghetti spaghettiPomodoro = new Spaghetti();
//		System.out.println(spaghettiPomodoro.texture);
//		
//		Pho phoChay = new Pho();
//		System.out.println(phoChay.shape);
//		
//		Ramen yasaiRamen = new Ramen();
//		System.out.println(yasaiRamen.ingredients);
//		System.out.println(yasaiRamen.isTasty());
//		
//		Spaetzle kaesespaetzle = new Spaetzle();
//		kaesespaetzle.cook();
		
		Noodle spaghetti, ramen, pho, spaetzle, biangBiang;
		spaghetti = new Spaghetti();
		ramen  = new Ramen();
		pho = new Pho();
		spaetzle = new Spaetzle();
		biangBiang = new BiangBiang();
		
		Noodle[] allTheNoodles = {spaghetti, ramen, pho, spaetzle, biangBiang};
		
		for (Noodle noodle : allTheNoodles) {
			System.out.println(noodle.getCookPrep());
		}
		
	}

}
