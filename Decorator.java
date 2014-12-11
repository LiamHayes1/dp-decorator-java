


abstract class Decorator implements IDiscount {
	protected IDiscount discount;
	
	public Decorator(IDiscount discount) {
		 this.discount = discount;
	}
	
	public String getDescription() {
		return discount.getDescription();
	}
	
	public double getDiscountPercent() {
		return discount.getDiscountPercent();
	}
}