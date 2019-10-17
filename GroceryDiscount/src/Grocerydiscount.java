import java.util.Scanner;
public class Grocerydiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double cost;
		Scanner in = new Scanner(System.in);
		System.out.println("state the cost of your grocieris: ");
		while(in.hasNextDouble()) {
		cost=in.nextDouble();
		if (cost==0) {
			break;
		}
		else if(cost<10.00) {
			System.out.println("no coupon for you");
		}
		else if(cost<=60.00) {
			System.out.printf("you win a discount coupon of %5.2f (8 percent of purcahse)",cost*.08 );
		}
		else if(cost<=150.00){
			System.out.printf("you win a discount coupon of %5.2f (10 percent of purchase)",cost*.10);
		}
		else if(cost<=210.00) {
			System.out.printf("you win a discount coupon of %5.2f (12 percent of purchase)",cost*.12);
		}
		else if(cost>210.00) {
		double cost4=cost*.14;
			System.out.printf("you win a discount coupon of %5.2f (14 percent of purchase)",cost4);
		}
		
		
	
		}
		
	}

}

