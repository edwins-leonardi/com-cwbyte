package algorithms.loops;

public class Cards {
	String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" }; 
	String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10",
	                  "Jack", "Queen", "King", "Ace"};
	
	public Card[] getDeck(){
		
		Card[] deck = new Card[ranks.length * suits.length];
		for (int rankId = 0; rankId < ranks.length; rankId++){ 
		    for (int suitId = 0; suitId < suits.length; suitId++){
		    	Card c = new Card(suits[suitId], ranks[rankId]);
		        deck[suits.length * rankId + suitId] = c; 
		    }
		}
		
		return deck;
		
	}
	
	public void shuffleDeck(Card[] deck){
		int N = deck.length; 
		for (int i = 0; i < N; i++) 
		{ 
		   int r = i + (int) (Math.random() * (N-i)); 
		   Card card = deck[r]; 
		   deck[r] = deck[i]; 
		   deck[i] = card; 
		} 
	}
	
}
