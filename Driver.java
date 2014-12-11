
public class Driver {
	public static void main(String[] args) {
		IDiscount discount = new Base();
				
		discount = new ConcreteDiscountLongTermRental(discount);
		discount = new ConcreteDiscountLoyalCustomer(discount);
		
		System.out.println(discount.getDescription());
	}
}
