package eecs2030.lab3;

import java.util.Date;
import java.util.Objects;

public class Apple implements Comparable<Apple>  {
	
	//Attributes of Apple Class
	private final String type;
	private final double sizeGrams;
	private final Date datePicked;

	
	/** This is a parameterized constructor for the Apple class.
	 * @param type is the unknown types of apples.
	 * @param sizeGrams is the weight of the apples.
	 * @param datePicked is the day the apples are picked.
	 */
	public Apple(String type, double sizeGrams, Date datePicked) {
		this.type = type;
		this.sizeGrams = sizeGrams;
		this.datePicked = datePicked;
	}
	
	//Default constructor
	public Apple() {
		this.type = "";
		this.sizeGrams = 150;
		this.datePicked = new Date();
	}
	
	/** This is a getter method for the attribute type.
	 * @return type returns the type of apple.
	 */
	public String getType() {
		return type;
	}

	/** This is a getter method for the attribute sizeGrams.
	 * @return sizeGrams returns the weight of the apple.
	 */
	public double getSizeGrams() {
		return sizeGrams;
	}

	/** This is a getter method for the attribute datePicked.
	 * @return datePicked return the current date the apples are picked.
	 */
	public Date getDatePicked() {
		return new Date(datePicked.getTime());
	}
	
	
	//This is compareTo method
	@Override
	public int compareTo(Apple other) {
		if (5*(Math.round(sizeGrams/5)) > (5*(Math.round(other.sizeGrams/5)))) {
			return 1;
		}
		else if (5*(Math.round(sizeGrams/5)) < (5*(Math.round(other.sizeGrams/5)))) {
			return -1;
		}	
		else if(!this.type.equals(other.type)) {
			return getType().compareTo(other.getType());
		}
		else if(!this.datePicked.equals(other.datePicked)) {
			return getDatePicked().compareTo(other.getDatePicked());
		}
		else {
			return 0;
		}
		
	}

	//This is the hash code method.
	@Override
	public int hashCode() {
		return Objects.hash(datePicked, sizeGrams, type);
	}

	//This is the equals method.
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Apple other = (Apple) obj;
		if (other.type != null) {
			return false;
		}else if(!this.type.equals(other.type)) {
				return false;
		}else if (5*(Math.round(sizeGrams/5)) != 5*(Math.round(other.sizeGrams/5))) {
			return false;
		}else if (datePicked == null) {
				return false;
		} else if(!this.datePicked.equals(other.datePicked))
				return false;
		else {
			return true;
	}
}
	
	//This is the toString method.
	@Override
	public String toString() {
		return "Apple [type = " + type + ", sizeGrams = " + sizeGrams + ", datePicked = " + datePicked + "]";
	}
	

	
	
	
	

	
}
