


public class ConcreteDiscountLongTermRental extends Decorator {
	private double longTermRentalDiscount = 0.05;
	
	public ConcreteDiscountLongTermRental(IDiscount discount) {
		super(discount);
	}
	
	public String getDescription() {
		return discount.getDescription() + " long term(5)";
	}
	
	public double getDiscountPercent() {
		return discount.getDiscountPercent() + longTermRentalDiscount;
	}
}
