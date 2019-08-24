package lj;

class Spaghetti extends Noodle {
	
	Spaghetti(){
		
		super(30,0.25,"round","wheat flour");
	}
	
	@Override
	public String getCookPrep() {
		
		return "Boil spaghetti for 8-12 minutes and add sauce, cheese, or oil and garlic.";
	}

}
