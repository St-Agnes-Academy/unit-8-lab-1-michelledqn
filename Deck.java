public class Deck 
{
    private int numCards;
    private Card[] cards;
    
    public Deck()
    {
        numCards = 52;
        cards = new Card[numCards];

        String suits[] = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String ranks[] = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};

        for(int j = 0; j < 4; j++)
        {
            for(int i = 0; i < 13; i++)
                cards[j * 13 + i] = new Card(suits[j], ranks[i], i+1);
        }

        shuffle();
    }

    public String toString()
    {
        String deck = "";
        for(Card card: cards)
        {
            deck += card + "\n";
        }
        return deck;
    }

    public void shuffle()
    {
        for(int i = 0; i < 1000; i++)
        {
            int rand1 = (int)(Math.random()*numCards);
            int rand2 = (int)(Math.random()*numCards);
            
            swap(rand1, rand2);
        }
    }

    public void swap(int p, int q)
    {
        Card temp = cards[p];
        cards[p] = cards[q];
        cards[q] = temp;
    }
}
