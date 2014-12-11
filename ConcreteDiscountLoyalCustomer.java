



public class ConcreteDiscountLoyalCustomer extends Decorator {
	private double loyalCustomerDiscount = 0.03;
	
	public ConcreteDiscountLoyalCustomer(IDiscount discount) {
			super(discount);
	}
	
	public String getDescription() {
		return discount.getDescription() + " loyal cmr(3)";
	}
	
	public double getDiscountPercent() {
		return discount.getDiscountPercent() + loyalCustomerDiscount;
	}
}
