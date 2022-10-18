package study;


import java.util.ArrayList;
import java.util.Collections;
class Card{
	String suit;
	String number;
	public Card(String suit, String number){
		this.suit = suit;
		this.number = number;
	}
	public String toString(){
		return suit + " " + number;
	}
}

class CardDeck{

	ArrayList<Card> deck = new ArrayList<Card>();

	public CardDeck(){
		String []suit = {"Clubs","Diamonds","Hearts","Spades"};
		String []number = {"2","3","4","5","6","7","8","9","10",
						"Jack","Queen","King","Ace"};

		for(int i=0; i<suit.length; i++){
			for(int j=0; j<number.length; j++){
				deck.add(new Card( suit[i], number[j] ));
			}
		}
	}

	public void shuffle(){
		Collections.shuffle( deck  );
	}
	
	public Card deal(){
		return deck.remove(0);
	}
}

class Player{
	ArrayList<Card> list = new ArrayList<Card>();
	public void getCard(Card card){
		list.add(card);
	}
	public void showCards(){
		System.out.println(list);
	}

	public int isOnePair(){
		int n = 0;
		for( int i=0; i<list.size(); i++){
			for(int j=i+1; j<list.size(); j++){
				if(list.get(i).number.equals( list.get(j).number )){
					String number = list.get(i).number;
					//"2","3","4","5","6","7","8","9","10",
					//	"Jack","Queen","King","Ace"
					//	11		12		13		14
					switch(number){
						case "Jack":n = 11;break;
						case "Queen":n = 12;break;
						case "King":n = 13;break;
						case "Ace":n = 14;break;
						default:n = Integer.parseInt(number);
					}
				}
			}
		}
		return n;
	}
}



class CardGame {
	public static void main(String[] args) {
		CardDeck deck = new CardDeck();
		deck.shuffle();
		Player p1 = new Player();
		Player p2 = new Player();
		for(int i=1; i<=5; i++){
			p1.getCard(deck.deal());
			p2.getCard(deck.deal());
		}
		
		p1.showCards();
		p2.showCards();

		if(p1.isOnePair() > 0){
			System.out.println("경기자1은 원페어입니다.");
		}
		
		if(p2.isOnePair() > 0){
			System.out.println("경기자2는 원페어입니다.");
		}

		if(p1.isOnePair() == p2.isOnePair()){
			System.out.println("비겼습니다.");
		}else if(p1.isOnePair() > p2.isOnePair()){
			System.out.println("경기자1이 이겼습니다.");
		}else{
			System.out.println("경기자2가 이겼습니다.");
		}
	}
}
