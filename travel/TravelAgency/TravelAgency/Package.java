
public class Package {
	private String packageId;
	private String sourcePlace;
	private String destinationPlace;
	private double basicFare;
	private int noOfDays;
	private double packageCost;
	public String getPackageId() {
		return packageId;
	}
	public void setPackageId(String packageId) {
		this.packageId = packageId;
	}
	public String getSourcePlace() {
		return sourcePlace;
	}
	public void setSourcePlace(String sourcePlace) {
		this.sourcePlace = sourcePlace;
	}
	public String getDestinationPlace() {
		return destinationPlace;
	}
	public void setDestinationPlace(String destinationPlace) {
		this.destinationPlace = destinationPlace;
	}
	public double getBasicFare() {
		return basicFare;
	}
	public void setBasicFare(double basicFare) {
		this.basicFare = basicFare;
	}
	public int getNoOfDays() {
		return noOfDays;
	}
	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}
	public double getPackageCost() {
		return packageCost;
	}
	public void setPackageCost(double packageCost) {
		this.packageCost = packageCost;
	}
	
	/**
	 * Calculate package cost
	 */
	public void calculatePackageCost() {
	    int discountRate = 0;
	    double discount, discountedPrice, packageCost, gst, finalPrice;
		if(this.noOfDays <= 5) {
		    discountRate = 0;
		} else if(this.noOfDays > 5 &&this.noOfDays <= 8) {
		    discountRate = 3;
		} else if(this.noOfDays > 8 &&this.noOfDays <= 10) {
		    discountRate = 5;
		} else if(this.noOfDays > 10) {
		    discountRate = 7;
		}
		packageCost = this.noOfDays * this.basicFare;
		discount = packageCost * discountRate / 100;
		discountedPrice = packageCost - discount;
		gst = discountedPrice * 12 / 100;
		finalPrice = discountedPrice + gst;
		this.setPackageCost(finalPrice);
	}
}
