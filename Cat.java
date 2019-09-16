package lj;

public class Cat {
	
	private static int catCount = 0;
	
	public static void setCatCount(int catCount) {
		
		Cat.catCount = catCount;
		//why can't i use: this.catCount = catCount?
	}
	
	public static void main(String[] args) {
		setCatCount(9);
		System.out.println("you have " + catCount + " cats, yikes!");
		
	}

}
