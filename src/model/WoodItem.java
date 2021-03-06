/**
 * Class defining the elements of a wood type
 */
package model;

/**
 * @author Esteban & Elliot Rauchwerger
 *
 */
public class WoodItem {

	String type;
	Double baseDeliveryTime;
	Double price;
	
	/**
	 * Default constructor 
	 */
	public WoodItem(){
		this.type = "Empty";
		this.baseDeliveryTime = 0.0;
		this.price = 0.0;
	}
	
	/**
	 * Constructor of a WoodItem element with parameters
	 * @param name of wood
	 * @param base delivery time of wood
	 * @param price of wood per BF
	 */
	public WoodItem(String type, Double daseDeliveryTime, Double price) {
		this.type = type;
		this.baseDeliveryTime = daseDeliveryTime;
		this.price = price;
	}

	/**
	 * Get the type of Wood
	 * 
	 * @return name of the WoodItem
	 */
	public String getType() {
		return type;
	}

	/**
	 * Get the base delivery time
	 * 
	 * @return the baseDeliverytime
	 */
	public Double getBaseDeliveryTime() {
		return baseDeliveryTime;
	}

	/**
	 * 
	 * Get the price per Bare Foot
	 * 
	 * @return the price for 1 Bare Foot of this WoodItem
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
