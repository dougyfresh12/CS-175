import java.util.Random;
public class Cards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myHand = new int[5];
		int[] yourHand = new int[5];
		String mysuit="";
		String yoursuit="";
		Random generator = new Random();
		int card=0;
		int countH=0;
		int countD=0;
		int countC=0;
		int countS=0;
		for(int i =0;i<5;i++)
		{
			card = 1+generator.nextInt(52);
			myHand[i]=card;
			System.out.println("player one " +myHand[i]);
			
			card = 1+generator.nextInt(52);
			yourHand[i]=card;
			System.out.println("player two "+yourHand[i]);
		}
		for(int j=0;j<5;j++) {
			if (myHand[j]>=1&&myHand[j]<=13){
			
			countH++;
			}
			else if(myHand[j]>=14&&myHand[j]<=26) {
				countD++;
			}
			else if(myHand[j]>=27&&myHand[j]<=39) {
				countC++;
			}
			else if(myHand[j]>=40&&myHand[j]<=52) {
				countS++;
			}
		}
			if(countH>countD&&countH>countC&&countH>countS)
					mysuit="Hearts";
				else if(countD>countH&&countD>countC&&countD>countS)
					mysuit="Diamonds";
				else if(countC>countD&&countC>countH&&countC>countS)
					mysuit="Clubs";
				else if(countS>countD&&countS>countC&&countS>countH)
					mysuit="Spades";
			System.out.println("My Suit: "+mysuit);
		
			 card=0;
			 countH=0;
			 countD=0;
			 countC=0;
			 countS=0;
			
		for(int j=0;j<5;j++) {
			if (yourHand[j]>=1&&yourHand[j]<=13){
			{countH=countH+1;};
			countH++;
			}
			else if(yourHand[j]>=14&&yourHand[j]<=26) {
				countD++;
			}
			else if(yourHand[j]>=27&&yourHand[j]<=39) {
				countC++;
			}
			else if(yourHand[j]>=40&&yourHand[j]<=52) {
				countS++;
			}

			if(countH>countD&&countH>countC&&countH>countS)
				yoursuit="Hearts";
			else if(countD>countH&&countD>countC&&countD>countS)
				yoursuit="Diamonds";
			else if(countC>countD&&countC>countH&&countC>countS)
				yoursuit="Clubs";
			else if(countS>countD&&countS>countC&&countS>countH)
				yoursuit="Spades";
			System.out.println("your Suit: "+yoursuit);
		}
		

	}

}
