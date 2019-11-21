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
			System.out.println("palyer two "+yourHand[i]);
		}
		for(int j=0;j<5;j++) {
			if (myHand[j]>=1&&myHand[j]<=13){countH=countH+1;};
			
			
		}
		

	}

}
