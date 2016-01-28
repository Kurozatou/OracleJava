/**
 * Class defining the elements of a wood order
 */
package model;

/**
 * @author Elliot Rauchwerger
 *
 */
public class WoodOrder {

	WoodItem type;
	Integer quantity;
	Double price;
	Double deliveryTime;
	
	/**
	 * Constructor of a WoodOrder element with parameters
	 * @param type Name of the wood type
	 * @param daseDeliveryTime base delivery time
	 * @param price price per Bare Foot
	 */
	public WoodOrder(WoodItem type, Integer quantity, Double price, Double deliveryTime) {
		this.type = type;
		this.quantity = quantity;
		this.price = price;
		this.deliveryTime = deliveryTime;
	}

	/**
	 * Get the type of Wood
	 * 
	 * @return Name of the WoodItem
	 */
	public String getType() {
		return type.type;
	}

	/**
	 * 
	 * Get the quantity ordered
	 * 
	 * @return the total quantity
	 */
	public Integer getQuantity() {
		return quantity;
	}
	
	/**
	 * Get the base delivery time
	 * 
	 * @return the baseDeliverytime
	 */
	public Double getDeliveryTime() {
		return deliveryTime;
	}

	/**
	 * 
	 * Get the total price
	 * 
	 * @return the total price
	 */
	public Double getPrice() {
		return price;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 * You may implement this method to fit your needs
	 */
	@Override
	public String toString() {	
		return "";
	}
	
}