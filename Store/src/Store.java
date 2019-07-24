public class Store {
	// instance fields
	String productType;
	int inventoryCount;
	double inventoryPrice;
	
	//constructor method
	public Store(String product, int count, double price) {
		productType = product;
		inventoryCount = count;
		inventoryPrice = price;
	}
	//advertise method
	public void advertise() {
		System.out.println("Selling " + productType + "!");
		System.out.println("Come spend some money!");
	}
	//greet method
	public void greetCustomer(String customer) {
		System.out.println("Welcome to the store, " + customer + "!");
	}
	//increase price method
	public void increasePrice(double priceToAdd) {
		double newPrice = inventoryPrice + priceToAdd;
		inventoryPrice = newPrice;
	}
	//get price with tax method
	public double getPriceWithTax() {
		double totalPrice = inventoryPrice + (inventoryPrice*0.08);
		return totalPrice;
	}
	//main method
	public static void main(String[] args) {
		Store lemonadeStand = new Store("lemonade", 42, 0.99);
		Store cookieShop = new Store("cookie", 12, 3.75);
		//increase lemonade prices
		lemonadeStand.increasePrice(1.5);
		
		System.out.println("Our first shop sells " +
		lemonadeStand.productType + " at " + lemonadeStand.inventoryPrice + 
		" per unit.");
		double lemonadePrice = lemonadeStand.getPriceWithTax();
		System.out.println(lemonadePrice);
		cookieShop.greetCustomer("Brandon");
		cookieShop.advertise();
		
		System.out.println("Our second shop has " + 
		cookieShop.inventoryCount + " units remaining.");
	}
	
}



