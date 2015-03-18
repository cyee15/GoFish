public class Deck

{


ArrayList <Integer> myDeck = new ArrayList<Integer>();
  {
    for (Integer i = new Integer (1); i <= 13; i++)
    {
      myDeck.add(i);
      myDeck.add(i);
      myDeck.add(i);
      myDeck.add(i);
    }
  }
    
    
    // Integer == card
    // int == index
    
    public ArrayList shuffle(ArrayList myDeck)
    {
      for (int i = 0; i <myDeck.length()-1; i++)
      {
        int random = (int)(Math.random()*(i+1));
        Integer temp = myDeck.get(i);
        myDeck.get(i) = myDeck.get(random);
        myDeck.get(random) = temp;
      }
      return myDeck;
    }
}