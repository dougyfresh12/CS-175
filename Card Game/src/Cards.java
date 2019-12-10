import java.util.Random;
import java.util.Arrays;
public class Cards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		int countHeart = 0;
		int countDiamond = 0;
		int countClub = 0;
		int countSpade = 0;
		int countDraw = 0;
		int[] deck = new int[52];
		int myDraw = 0;
		int yourDraw = 0;
		String mySuit = null;
		String yourSuit = null;
		int[] myHand = new int[5];
		int[] yourHand = new int[5];
		boolean winner = false;
		int mySuitH = 0;
		int mySuitL = 0;
		int yourSuitH = 0;
		int yourSuitL = 0;
		int yourGoodCount=0;
		int myGoodCount=0;
		int yourCount = 0;
		int card =0;
		boolean goodCard=false;
		
				for (int c=0;c<52;c++)
				{deck[c]=0;}

				for (int i = 0; i < myHand.length; i++) {


					//draw a card until a card if drawn that is not in play, insert into hand, mark as out of play
					while (goodCard==false) 
					{		
						card = generator.nextInt(52)+1;
						if (deck[card-1]==0) 
							{myHand[i] = card; deck[card-1]=1;break;}
					}	
					//end of while loop	

					if (myHand[i] >= 1 && myHand[i] <= 13) {
						countHeart++;
					}
					else if (myHand[i] >= 14 && myHand[i] <= 26) {
						countDiamond++;
					}
					else if (myHand[i] >= 27 && myHand[i] <= 39) {
						countClub++;
					}
					else if (myHand[i] >= 40 && myHand[i] <= 52) {
						countSpade++;
					}
					if (countHeart >= countDiamond && countHeart >= countClub && countHeart >= countSpade) {
						mySuit = "Hearts";
					}
					else if (countDiamond >= countHeart && countDiamond >= countClub && countDiamond >= countSpade) {
						mySuit = "Diamonds";
					}
					else if (countClub >= countHeart && countClub >= countDiamond && countClub >= countSpade) {
						mySuit = "Clubs";
					}
					else if (countSpade >= countHeart && countSpade >= countClub && countSpade >= countDiamond) {
						mySuit = "Spades";
					}
				}

				//assigns card values to YOURHAND and determines suit
				for (int i = 0; i < yourHand.length; i++) {

					//draw a card until a card if drawn that is not in play, insert into hand, mark as out of play
					while (goodCard==false) 
					{		
						card = generator.nextInt(52)+1;
						if (deck[card-1]==0) 
							{yourHand[i] = card; deck[card-1]=1;break;}
					}	
					//end of while loop	

						if (yourHand[i] >= 1 && yourHand[i] <= 13) {
						countHeart++;
					}
					else if (yourHand[i] >= 14 && yourHand[i] <= 26) {
						countDiamond++;
					}
					else if (yourHand[i] >= 27 && yourHand[i] <= 39) {
						countClub++;
					}
					else if (yourHand[i] >= 40 && yourHand[i] <= 52) {
						countSpade++;
					}
					if (countHeart >= countDiamond && countHeart >= countClub && countHeart >= countSpade) {
						yourSuit = "Hearts";
					}
					else if (countDiamond >= countHeart && countDiamond >= countClub && countDiamond >= countSpade) {
						yourSuit = "Diamonds";
					}
					else if (countClub >= countHeart && countClub >= countDiamond && countClub >= countSpade) {
						yourSuit = "Clubs";
					}
					else if (countSpade >= countHeart && countSpade >= countClub && countSpade >= countDiamond) {
						yourSuit = "Spades";
					}
				}
				System.out.println("My hand has five cards: " + Arrays.toString(myHand));
				System.out.println("Your hand has five cards: " + Arrays.toString(yourHand));
				System.out.println("My suit is " + mySuit + ".");
				System.out.println("Your suit is " + yourSuit + ".");

				//PRINT THE DECK ARRAY 1 MEANS CARD IS IN A HAND 0 MEANS IT IS AVAILABLE 
				System.out.println("The deck: " + Arrays.toString(deck));
				System.out.println();	

				if (mySuit.equals("Hearts")){mySuitL=1;mySuitH = 13;}
				if (mySuit.equals("Diamonds")){mySuitL=14;mySuitH = 26;}
				if (mySuit.equals("Clubs")){mySuitL=27;mySuitH = 39;}
				if (mySuit.equals("Spades")){mySuitL=40;mySuitH = 52;}
				if (yourSuit.equals("Hearts")){yourSuitL=0;yourSuitH = 13;}
				if (yourSuit.equals("Diamonds")){yourSuitL=14;yourSuitH= 26;}
				if (yourSuit.equals("Clubs")){yourSuitL=27;yourSuitH = 39;}
				if (yourSuit.equals("Spades")){yourSuitL=40;yourSuitH = 52;}

				
				while (!winner) 
				{
					countDraw++;
				
					while (goodCard==false) 
					{		
						card = generator.nextInt(52)+1;
						if (deck[card-1]==0) 
							{myDraw=card;break;}
					}	
					
					System.out.println("My draw " + countDraw + ": " + myDraw);

					
					while (goodCard==false) 
					{		
						card = generator.nextInt(52)+1;
						if (deck[card-1]==0) 
							{yourDraw=card;break;}
					}	
			
					System.out.println("Your draw " + countDraw + ": " + yourDraw);

				
					if (myDraw>=mySuitL && myDraw<=mySuitH) 
					{
						for (int i = 0; i < 5; i++) 
						{
							if (myHand[i] < mySuitL || myHand[i]> mySuitH) 
							{
								deck[myHand[i]-1]=0;
								myHand[i] = myDraw;
								deck[myDraw-1]=1;
								break;}
						}
								
								
					}
					myGoodCount = 0;

				
					for (int j=0; j<5;j++) 
					{
						if (myHand[j]>=mySuitL && myHand[j]<=mySuitH)
						{
							myGoodCount = myGoodCount+1;
						}
					}
					System.out.println("\tMy new hand is " + Arrays.toString(myHand));
					if (myGoodCount == 5 )
							{winner=true;System.out.println("I am the winner.");break;}
					
					if (yourDraw>=yourSuitL && yourDraw<=yourSuitH) 
					{
						for (int i = 0; i < 5; i++) 
						{
							if (yourHand[i] < yourSuitL || yourHand[i]> yourSuitH) 
							{
								deck[yourHand[i]-1]=0;
								yourHand[i] = yourDraw;
								deck[yourDraw-1]=0;
							break;}
						}
								
								
					}
					yourGoodCount = 0;


					for (int j=0; j<5;j++) 
					{
						if (yourHand[j]>=yourSuitL && yourHand[j]<=yourSuitH)
						{
							yourGoodCount = yourGoodCount+1;
						}
					}
					System.out.println("\tYour new hand is " + Arrays.toString(yourHand));
					if (yourGoodCount == 5 )
							{winner=true;System.out.println("You are the winner.");break;}

					System.out.println("The deck: " + Arrays.toString(deck));
					System.out.println();	
					
				}		
				System.out.println("The game is over.");

				
				System.out.println("The deck: " + Arrays.toString(deck));


		}


	}