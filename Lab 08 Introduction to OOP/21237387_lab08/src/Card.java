public class Card {
    private int suit;
    private int rank;

    public Card(int suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }


    public int getsuit() {
        return suit;
    }
    public void setsuit(int suit) {
        this.suit = suit;
    }
    public int getrank() {
        return rank;
    }
    public void setrank(int rank) {
        this.rank = rank;
    }

    public boolean equals(Card obj ){
        if(this.suit == obj.suit && this.rank == obj.rank){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {

        String[] s = {"Diamonds" , "Clubs", "Hearts", "Spades"};
        String[] r = {"","Ace","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten", "Jack", "Queen", "King"};

        return r[rank]+" of "+s[suit];
    }

    public static void main(String[] args){
        Card c1 = new Card(0, 1); //suit: Diamonds, rank: Ace
        Card c2 = new Card(0, 1); //suit: Diamonds, rank: Ace
        Card c3 = new Card(1, 1); //suit: Clubs, rank: Ace
        Card c4 = new Card(1, 2); //suit: Clubs, rank: 2
        System.out.println(c1);
        System.out.println(c2);

        if(c1.equals(c2)){
            System.out.println("They are equal.");
        }
        else{
            System.out.println("They are not equal.");
        }
        System.out.println(c1);
        System.out.println(c3);
        if(c1.equals(c3)){
            System.out.println("They are equal.");
        }
        else{
            System.out.println("They are not equal.");
        }
        System.out.println(c3);
        System.out.println(c4);
        if(c3.equals(c4)){
            System.out.println("They are equal.");
        }
        else{
            System.out.println("They are not equal.");
        }
    }
}