import java.until.*;
import java.util.Scanner;

public class Game
{
  public static void main(String args[])
  {
  Deck deck = new Deck();
  Hands hands = new Hands();
  
  Scanner kb = new Scanner(System.in);
  boolean turn = true;

  int humanwins = 0;
  int computerwins = 0;
  Integer drawcard = 0;
  hands.humanHand();
  hands.computerHand();

  
  if (turn == true)
  {
    System.out.println("Your hand: " + humanHand);
    System.out.println("Computer, do you have a ");
      Integer humanquestioncard = kb.nextInt();
    for (int i = 0; int < hands.humanhandLength(); i++)
    {
      if (humanquestioncard == computerHand.get(i))
      {
        hands.dumpcards();
        hands.humandrawscard();
        hands.computerdrawscard();
        humanwins++;
        System.out.println("Yes");
        System.out.println("You have " + humanwins + ". I have " + computerwins + ".");
        System.out.println("You drew a " + drawcard + ". Your hand is now " + humanHand + "."); 
      }
      else
      {
        System.out.println("Go Fish.");
        hands.humandrawscard();
        System.out.println("You drew a " + drawcard + ". Your hand is now " + humanHand + ".");
      }
    }
    turn = false;
  }
  if (turn == false)
  {
    System.out.println("Do you have a " + hands.computerquestioncard() + "? Type 0 for yes, 1 for no.");
    Integer humananswer = kb.nextInt();
    if (humananswer == hands.computerquestioncard());
    {   
      hands.humandeck.remove(humananswer);
      hands.computerdeck.remove(humananswer);
      hands.humandrawscard();
      hands.computerdrawscard();
      computerwins++;
      System.out.println("I have " + computerwins + ". You have " + humanwins + ".");
      System.out.println("You drew a " + humandrawcard + ". Your hand is now " + humanHand + ".");
    }
    if (humananswer !== computerquestioncard );
    {
      System.out.println("Too bad. Your turn");
    }
    else
    {
      System.out.println("Please type 0 for yes, 1 for no.");
      int humananswer = kb.nextInt();
    }
    turn = true;
  }
  }
}