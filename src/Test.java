
public class Test {
	
	public static void main(String[] args) {
		ShoppingCart shoppingCart = ShoppingCart.getInstance();
		
		//Attempt to create more instances if we do have only one instance
		ShoppingCart shoppingCart2 = ShoppingCart.getInstance();
		ShoppingCart shoppingCart3 = ShoppingCart.getInstance();
		ShoppingCart shoppingCart4 = ShoppingCart.getInstance();
		
		//Take the counter form shoppingCart4 to if we do have only one instance 
		System.out.println(shoppingCart4.getCounter());
		
		//The result is still 1. So there is only one instance
		//After the first creation we can not reach the body of the if block inside getInstance() method
	}
	
}
