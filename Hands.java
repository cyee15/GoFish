public class Hands
{

  Deck deck = new Deck;
String humanHand = "";
  String computerHand = "";

public void humanHand()
{
  
ArrayList <Integer> humanhand = new ArrayList<int>();
//humanhand is first five cards
//removes first five cards from deck

  humanhand.add(deck.myDeck.get(0));
  deck.myDeck.remove(0);
  humanhand.add(deck.myDeck.get(0));
  deck.myDeck.remove(0);
  humanhand.add(deck.myDeck.get(0));
  deck.myDeck.remove(0);
  humanhand.add(deck.myDeck.get(0));
  deck.myDeck.remove(0);
  humanhand.add(deck.myDeck.get(0));
  deck.myDeck.remove(0);
  
}  

public int humanhandlength()
{
  return humanhand.length();
}

public void computerHand()
{
ArrayList <int> computerhand = new ArrayList<int>();
//computerhand is second five cards
//removes five cards from deck
  computerhand.add(deck.myDeck.get(0));
  deck.myDeck.remove(0);
  computerhand.add(deck.myDeck.get(0));
  deck.myDeck.remove(0);
  computerhand.add(deck.myDeck.get(0));
  deck.myDeck.remove(0);
  computerhand.add(deck.myDeck.get(0));
  deck.myDeck.remove(0);
  computerhand.add(deck.myDeck.get(0));
  deck.myDeck.remove(0);
}

public int computerhandlength()
{
  return computerhand.length();
}

public void humandrawscard()
{
  humandrawcard = deck.myDeck.get(0);
  humandeck.add(deck.myDeck.get(0));
  deck.myDeck.remove(0);
}

  public void computerdrawscard()
{
  computerdrawcard = deck.myDeck.get(0);
  computerhand.add(myDeck.get(0));
  deck.myDeck.remove(0);
} 

public void dumpscard(Integer humanquestioncard)
{
  humanhand.remove(humanquestioncard);
  computerhand.remove(humanquestioncard);
}

public Integer computergeneratedcard()
{
  Integer computerquestioncard = computerdeck.get(Math.random()*(computerdeck.length));
  return computerquestioncard;
}
        
}