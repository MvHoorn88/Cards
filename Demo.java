import java.util.Random;
public class Demo {
	public static void main(String[] args) {
		Dealer dealer = new Dealer();
		Card[] hand = new Card[8];
		for(int x = 0 ; x < 8 ; x++) {
			hand[x] = dealer.getCard();
			hand[x].printCard();
		}
		//hand.sort();
	}
	static void testFunctionality() {
	}
}
	class Card {
		String suit;
		int value;
		void printCard() {
			String[] valueStrings = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
			System.out.println("Card: "+suit+" "+valueStrings[value]);
		}
	}
	class Dealer {
		String[] suits = {"Clubs", "Diamonds", "Spades", "Hearts"};
		int[] values ={0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		private int generateRandomNumber() {
		Random random = new Random();
		int generatedNumber = random.nextInt(52);
		return generatedNumber;
		}
		private Card getCardFromNumber(int deckNumber) {
			Card card = new Card();
			card.value = deckNumber%13;
			card.suit = suits[deckNumber/13];
			return card;
		}
		Card getCard() {
			return getCardFromNumber(generateRandomNumber());
		}
	}
	class Player {
	}
