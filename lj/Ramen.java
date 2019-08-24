package lj;

public class Ramen extends Noodle{
	
	Ramen(){
		
		super(30.0, 0.3, "flat", "wheat flour");
	}
	@Override
	  public String getCookPrep() {
	    
	    return "Boil ramen for 5 minutes in broth, then add meat, mushrooms, egg, and vegetables.";
	    
	  }
}
	
	/* in the Noodle class, made the isTasty() method final, so nobody can falsely say
	nooles aren't tasty
	
	
//	public boolean isTasty() {
//		
//		return false;
//}
 */
 

