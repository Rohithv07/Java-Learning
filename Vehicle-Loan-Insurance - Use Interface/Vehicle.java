
public class Vehicle implements Loan,Insurance{
	
	private String vehicleNumber;
	private String modelName;
	private String vehicleType;
	private double price;
	public double eamount;
	public double iamount;
	
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Vehicle(String vehicleNumber, String modelName, String vehicleType,double price) {
		
		this.vehicleNumber = vehicleNumber;
		this.modelName = modelName;
		this.vehicleType=vehicleType;
		this.price = price;
	}
	public double issueLoan(){
	    if(vehicleType=="4 wheeler")
	        eamount=0.8*price;
	    else if(vehicleType=="3 wheeler")
	        eamount=0.75*price;
	    else if(vehicleType=="2 wheeler")
	        eamount=0.5*price;
	        
	   return eamount;
	}
	public double takeInsurance(){
	    if(price<=150000)
	        iamount=3500;
	    else if(price>150000 && price<=300000)
	        iamount=4000;
	   else if (price>300000)
	        iamount=5000;
	   return iamount;
	}
	public Vehicle(){}

}
