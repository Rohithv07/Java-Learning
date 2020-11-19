import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {

		String filePath = "VarshTourPackageDetails.txt";
		TravelAgency t = new TravelAgency();
		List<Package> list = t.generatePackageCost(filePath);
		List<Package> packages = t.findPackagesWithMinimumNumberOfDays();
		if (list != null)  {
		    for (int i = 0; i < list.size(); i++) {
		        System.out.println("Package ID : " + list.get(i).getPackageId());
		        System.out.println("Source : " + list.get(i).getSourcePlace());
		        System.out.println("Destination : " + list.get(i).getDestinationPlace());
		        System.out.println("No of days : " + list.get(i).getNoOfDays());
		        System.out.println("Package Cost : " + list.get(i).getPackageCost());
		    }
		    System.out.println();
		}
		if (packages != null)  {
		    for (int i = 0; i < packages.size(); i++) {
		        System.out.println("Package ID : " + packages.get(i).getPackageId());
		        System.out.println("Source : " + packages.get(i).getSourcePlace());
		        System.out.println("Destination : " + packages.get(i).getDestinationPlace());
		        System.out.println("No of days : " + packages.get(i).getNoOfDays());
		        System.out.println("Package Cost : " + packages.get(i).getPackageCost());
		    }
		}
	}

}
