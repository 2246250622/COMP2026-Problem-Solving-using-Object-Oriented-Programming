public class Hand {
    private Card[] cards;



    public Hand( ) {
        this.cards = new Card[0];

    }

    public int getCount() {
        return cards.length;
    }

    public void addCard(Card c1) {
        Card[] newArray = new Card[cards.length + 1];
        for (int i = 0; i < newArray.length-1; i++) {
            newArray[i] = cards[i];
        }
        newArray[newArray.length-1] = c1;
        cards = newArray;
    }

    public Card getCard(int i){
        return cards[i];
    }

    public void removeCard( int num) {
        Card[] newHand = new Card[cards.length - 1];
        for (int i = 0; i < num; i++) {
            newHand[i] = cards[i];

        }
        for (int i = num; i < cards.length-1; i++) {
                newHand[i] = cards[++i];
            cards = newHand;
        }
    }
    private void removeCard(Card card) {
        int num = 0;
        Card[] newHand = new Card[cards.length - 1];
        for (int i = 0; i < cards.length; i++) {
            if (cards[i].equals(card)) {
                num = i;

            }
        }

        for (int j = num; j < cards.length-1; j++) {
            cards[j] = cards[++j];
        }
        for (int k = 0; k < newHand.length; k++) {
            newHand[k] = cards[k];
        }
        cards = newHand;
    }

    public String toString() {
        String str = "";
        for (int i = 0; i < getCount(); i++) {
            try{
            str +="["+i+"] " + getCard(i).toString() + "\n";
        }catch(Exception e){
           System.out.println("Debug message"+ i); }
        }
        return str;
    }


    public static void main(String[] args) {
        Hand myHand = new Hand();
        Card c1 = new Card(0, 1); //suit: Diamonds rank: Ace
        Card c2 = new Card(1, 5); //suit: Clubs rank: 5
        Card c3 = new Card(2, 11); //suit: Hearts rank: Jack
        Card c4 = new Card(3, 13); //suit: Spades rank: King
        //getCount
        System.out.println("No. of Cards: " + myHand.getCount());
        System.out.println(myHand); //empty
        //add cards
        myHand.addCard(c1);
        System.out.println("No. of Cards: " + myHand.getCount());
        System.out.println(myHand);
        myHand.addCard(c2);
        System.out.println("No. of Cards: " + myHand.getCount());
        System.out.println(myHand);
        myHand.addCard(c3);
        System.out.println("No. of Cards: " + myHand.getCount());
        System.out.println(myHand);
        myHand.addCard(c4);
        System.out.println("No. of Cards: " + myHand.getCount());
        System.out.println(myHand);
        //getCard
        System.out.println(myHand.getCard(2));
        System.out.println("No. of Cards: " + myHand.getCount());
        System.out.println(myHand);
        //remove cards
        myHand.removeCard(2);
        System.out.println("No. of Cards: " + myHand.getCount());
        System.out.println(myHand);
        myHand.removeCard(new Card(1, 5));
        System.out.println("No. of Cards: " + myHand.getCount());
        System.out.println(myHand);
    }


}