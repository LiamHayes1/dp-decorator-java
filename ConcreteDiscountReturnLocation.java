

public class ConcreteDiscountReturnLocation extends Decorator {
	private double returnLocationDiscount = 0.07;
	
	public ConcreteDiscountReturnLocation(IDiscount discount) {
		super(discount);
	}
	
	public String getDescription() {
		return discount.getDescription() + " return location(7)";
	}
	
	public double getDiscountPercent() {
		return discount.getDiscountPercent() + returnLocationDiscount;
	}
}
