
//Jose_Gonzalez

// creates a program that simulates a simple game of poker

package pokerHand; // This showed up when creating the program not sure what it is??
import java.util.Scanner;


public class PokerHand {
	
	public static void main(String[]args) {
	
		playGame();	
	}

	// Asks the player for five numbers and returns it to hand
	public static int[] gethand() {
		
		Scanner input= new Scanner(System.in);
		int[] hand= new int[5];
		
		System.out.println("Enter five numeric cards, no face cards.Use 2-9");
		
		for (int i=0; i<hand.length;i++)
		{
			System.out.print("Enter a card number");
			hand[i]= input.nextInt();
		}
		
		java.util.Arrays.sort(hand);
		return hand;
	}
	
	// determines the results of the hand the player selected
	
	public static void playGame() {
		int[] hand= gethand();
		
		if (containsFourOfaKind(hand)) {
			System.out.println("Four of a kind!");
		}else if (containsFullHouse(hand)) {
			System.out.println("fullhouse!");
		}else if(containsStraight(hand)) {
			System.out.println("Nice Straight!");
		}else if (containsThreeOfaKind(hand)) {
			System.out.println("Three of a Kind!");
		}else if (containsTwoPair(hand)) {
			System.out.println("Two Pairs!");
		}else if (containsPair(hand)) {
			System.out.println("One Pair!");
		}else {
			System.out.println("Highcard!");
		}
	}
	
	//determines if there is a pair
	public static boolean  containsPair(int hand[]) {
		int count=0;
		for(int i=0; i<hand.length;i++) {
			for(int k =(i+1);k<hand.length;k++)
			{
				if(hand[i]==hand[k]) {
					count++;
				}
			}
		}
		if (count >=1) {
			return true;
		}else {
			return false;
		}
		
	}	
	//determines if there are two pairs
	public static boolean  containsTwoPair(int hand[]) {
		int count=0;
		for(int i=0; i<hand.length;i++) {
			for(int k =(i+1);k<hand.length;k++)
			{
				if(hand[i]==hand[k]) {
					count++;
				}
			}
		}
		if (count >=2) {
			return true;
		}else {
			return false;
		}
		
	}	
	//determines if there are three of the same numbers
	public static boolean  containsThreeOfaKind(int hand[]) {
		int count=0;
		for(int i=0; i<hand.length;i++) {
			for(int k =(i+1);k<hand.length;k++){
				for (int l=(i+2);l<hand.length;l++) {
					if((hand[i]==hand[k])&& (hand[i]==hand[l])) {
						count++;
				}
				
			}
				}
			}
		
		if (count >=2)  {
			return true;
		}else {
			return false;
		}
		
	}
	
	//determines if there is a straight
	
	// is there a simplified way of doing this?
	public static boolean  containsStraight(int hand[]) {
		boolean result= false;
		
		if (hand[0] == 5 && hand[1] == 6 && hand[2] == 7 && hand[3] == 8 && hand[4] == 9){
		    result = true;
		}
		if (hand[0] == 4 && hand[1] == 5 && hand[2] == 6 && hand[3] == 7 && hand[4] == 8){
			result = true;
		}
		if (hand[0] == 3 && hand[1] == 4 && hand[2] == 5 && hand[3] == 6 && hand[4] == 7){
			result = true;
		}
		if (hand[0] == 2 && hand[1] == 3 && hand[2] == 4 && hand[3] == 5 && hand[4] == 6){
			result = true;
		} return result;
		
		
		
	}
	
	// determines if there is a full house
	public static boolean  containsFullHouse(int hand[]) {
		if (containsThreeOfaKind(hand)&& containsPair(hand)) {
			return true;
		}else {
			return false;
		}
		
	}
	// determines if there is Four of the same numbers
	public static boolean  containsFourOfaKind(int hand[]) {
		if (hand[0]==hand[1]&& hand[1]==hand[2]&&hand[2]==hand[3]
				||hand[1]==hand[2]&& hand[2]==hand[3]&&hand[3]==hand[4] ) {
			return true;
		}else {
			return false;
		}
	}


}
