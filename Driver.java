import java.until.*;

public class Driver
  
String humanHand = "";
String computerHand = "";
int hwins = 0;
int cwins = 0;
  
{
  
  ArrayList <int> myDeck = new ArrayList<int>();
  for (int i = 1; i <= 13; i++){
    myDeck.add(i);
    myDeck.add(i);
    myDeck.add(i);
    myDeck.add(i);
  }
  
  myDeck.shuffle();
  
  public void shuffle() {
    // Put all the used cards back into the deck, and shuffle it into
    // a random order.
    for ( int i = 51; i > 0; i-- ) { 
      int rand = (int)(Math.random()*(i+1));
      PlayingCard temp = deck[i];
      deck[i] = deck[rand];
      deck[rand] = temp;
    }
    cardsUsed = 0;
  }
  
  
  ArrayList <int> humanhand = new ArrayList<int>();
  //humanhand is first five cards
  //removes first five cards from deck
  
  {
    humanhand.add(myDeck.get(0));
    myDeck.remove(0);
    humanhand.add(myDeck.get(0));
    myDeck.remove(0);
    humanhand.add(myDeck.get(0));
    myDeck.remove(0);
    humanhand.add(myDeck.get(0));
    myDeck.remove(0);
    humanhand.add(myDeck.get(0));
    myDeck.remove(0);
    
    humanHand = humanhand.get(0) + "," + humanhand.get(1) + "," + humanhand.get(2) + "," + humannhand.get(3) + ","+ humanhand.get(4);
  }
  
  
  
  ArrayList <int> computerhand = new ArrayList<int>();
   //computerhand is second five cards
  //removes five cards from deck
  {
    computerhand.add(myDeck.get(0));
    myDeck.remove(0);
    computerhand.add(myDeck.get(0));
    myDeck.remove(0);
    computerhand.add(myDeck.get(0));
    myDeck.remove(0);
    computerhand.add(myDeck.get(0));
    myDeck.remove(0);
    computerhand.add(myDeck.get(0));
    myDeck.remove(0);
    
    computerHand = computerhand.get(0) + "," + computerhand.get(1) + "," + computerhand.get(2) + "," + computerhand.get(3) + ","+ computerhand.get(4);
  }
  
  
  public void humandrawscard()
  {
    humandeck.add(myDeck.get(0));
    myDeck.remove(0);
  }
  
  public void computerdrawscard()
  {
    computerdeck.add(myDeck.get(0));
    myDeck.remove(0);
  } 
  
  public void dumpcards(int wincard)
  {
    humandeck.remove(wincard);
    computerdeck.remove(wincard);
  }
  
  public int humanwins()
  {
    hwins = 
  }
  
  public int computerwins()
  {
    computerwins =
  }
  
  Scanner kb = new Scanner(System.in);
  boolean turn = true;
  if (turn = true)
  {
    System.out.println("Your hand: " + humanHand);
    System.out.println("Computer, do you have a ")
      int humanquestioncard = kb.nextInt();
    if (humanquestioncard = )
    {
      humandrawscard();
      computerdrawscard();
      System.out.println("Yes");
      System.out.println("You have " + humanwins + ". I have " + computerwins + ".");
      System.out.println("You drew a " + drawcard + ". Your hand is now " + humanHand + ".");

    }
    else
    {
      System.out.println("Go Fish.");
      System.out.println("You drew a " + drawcard + ". Your hand is now " + humanHand + ".");
    }
    turn = false;
  }
  if (turn = false)
  {
    System.out.println("Do you have a " + computerquestioncard + "? Type 0 for yes, 1 for no.");
    int humananswer = kb.nextInt();
    if (humananswer == 0);
    {
      System.out.println("I have " + computerwins + ". You have " + humanwins + ".");
      System.out.println("You drew a " + drawcard + ". Your hand is now " + humanHand + ".");
    }
    if (humananswer == 1);
    {
      System.out.println("Too bad. Your turn");
    }
    else
    {
      System.out.println("Please type 0 for yes, 1 for no.")
        int humananswer = kb.nextInt();
    }
    turn = true
  }
  
  
  
  
  
  
  
  }