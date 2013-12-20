package algorithms.loops;

public class Card {
	
	public Card(String suit, String rank){
		this.suit = suit;
		this.rank = rank;
	}
	
	private String suit;
	private String rank;
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	@Override
	public String toString() {
		return this.rank + " of " + this.suit;
	}
}
