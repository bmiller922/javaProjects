package lj;

class Spaetzle extends Noodle {
	
	Spaetzle() {
		
		super(3.0, 1.5, "irregular", "eggs, flour, salt");
		this.texture = "lumpy and liquid";
		
	}
	
	@Override
	public void cook() {
		
			System.out.println("Grinding or scraping dough.");
			System.out.println("Boiling");
		
			this.texture = "cooked";
		
		}
	
	@Override
	  public String getCookPrep() {
	    
	    return "Grind or scrape spaetzle dough into boiling water, cook for 5 minutes. Top with butter and salt.";
	    
	  }
	

}
