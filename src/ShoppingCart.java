
public class ShoppingCart {
	
	private static volatile ShoppingCart shoppingCart;
	
	//add counter just to verify that only one instance will be created
	private static int COUNTER;
	
	//private constructor to restrict external creation
	private ShoppingCart() {
		COUNTER++;
	}
	
	//lazy instantiation (on demand)
	public static ShoppingCart getInstance() {
		//use double-checking to ensure thread safe creation inside synchronized block
		if(shoppingCart == null) {
			synchronized (ShoppingCart.class) {
				if(shoppingCart == null) {
					shoppingCart = new ShoppingCart();
				}
			}
		}
		
		return shoppingCart;
	}
	
	public int getCounter() {
		return COUNTER;
	}

}
