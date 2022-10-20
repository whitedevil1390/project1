package indivana;



import java.util.Scanner;

import org.jfree.data.category.DefaultCategoryDataset;

public class mainpage {
	
	

	public static void main(String[] args) {
		
	
		
		
		System.out.println("EECS 3311 project 1 ");
		System.out.print("enter from year :");
		Scanner scan = new Scanner(System.in);
		String from_year=scan.nextLine();
		System.out.print("enter to year :");
		String to_year=scan.nextLine();
		
		
		System.out.println("from "+from_year +" to year "+to_year);
		
		String[] indicator= {"EN.ATM.CO2E.PC","EN.ATM.PM25.MC.M3"};
		Getdata gd=new Getdata(indicator, "CAN", from_year, to_year);
		
		
		analysisth3 az3=new analysisth3(gd.series);
		az3.timeSeriesList.toString();
		
	
	

	}

}
