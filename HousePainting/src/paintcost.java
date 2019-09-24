import java.util.Scanner;
public class paintcost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Calculate cost to paint a house
		 */
		
		int houselengthfeet;
		int houselengthinches;
		int housewidthfeet;
		int housewidthinches;
		int househeightfeet;
		int househeightinches;
		int windowlengthfeet;
		int windowlengthinches;
		int windowwidthfeet;
	    int windowwidthinches;
		int windownumbers;
		int doorlengthfeet;
		int doorlengthinches;
		int doorwidthfeet;
		int doorwidthinches;
		int doornumber;
		double cost;
		double squarefeetofwall;
		double squarefeetpeak;
		double Sqftwindow;
		double Sqftdoor;
		double totalsqft;
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter length of wall in feet:");
		houselengthfeet= in.nextInt();
		System.out.println("please enter remaining length of wall in inches:");
		houselengthinches=in.nextInt();
		System.out.println("Please enter width of wall in feet:");
		housewidthfeet=in.nextInt();
		System.out.println("please enter remaining width of wall in inches:");
		housewidthinches=in.nextInt();
		squarefeetofwall=((((double)houselengthfeet+houselengthinches/12))*((double)housewidthfeet+housewidthinches/12));
	
				
				
				
		System.out.println("please enter height of house");
		househeightfeet=in.nextInt();
		System.out.println("please enter remaining height of house in inches:");
		househeightinches=in.nextInt();
		squarefeetpeak=((((double)houselengthfeet+houselengthinches/12))*(housewidthfeet+housewidthinches/12)+((double)houselengthfeet+houselengthinches/12)*(((double)househeightfeet+househeightinches/12)-((double)housewidthfeet+housewidthinches/12))/2);

		
		System.out.println("please enter the number of windows the house has:");
		windownumbers=in.nextInt();
		System.out.println("please enter length of windows in feet:");
		windowlengthfeet=in.nextInt();
		System.out.println("please enter remaining length of windows in inches:");
		windowlengthinches=in.nextInt();
		System.out.println("please enter width of windows in feet:");
		windowwidthfeet=in.nextInt();
		System.out.println("please enter remaining width of windows in inches:");
		windowwidthinches=in.nextInt();
		Sqftwindow=(((double)windowlengthfeet+windowlengthinches/12)*((double)windowwidthfeet+windowwidthinches/12));
		
		
		System.out.println("please state the number of doors on the house:");
		doornumber=in.nextInt();
		System.out.println("please enter the length of the doors in feet:");
		doorlengthfeet=in.nextInt();
		System.out.println("please enter the remaining length of the doors in inches:");
		doorlengthinches=in.nextInt();
		System.out.println("please enter the width of the doors in feet:");
		doorwidthfeet=in.nextInt();
		System.out.println("Please enter the remaining width of the doors in inches:");
		doorwidthinches=in.nextInt();
		Sqftdoor=(((double)doorlengthfeet+doorlengthinches/12)*((double)doorwidthfeet+doorwidthinches/12));
		
		System.out.println("please state the cost:");
		cost=in.nextInt();
		totalsqft=((squarefeetpeak)*2+(squarefeetofwall)*2)-(windownumbers*Sqftwindow)-(doornumber*Sqftdoor);
		System.out.println("total ="+totalsqft);
		System.out.println("cost =" +totalsqft*cost);
		System.out.println("wall =" +squarefeetofwall);
		System.out.println("peak =" +squarefeetpeak);
		System.out.println("window =" +Sqftwindow);
		System.out.println("door =" +Sqftdoor);
	
	}

}
