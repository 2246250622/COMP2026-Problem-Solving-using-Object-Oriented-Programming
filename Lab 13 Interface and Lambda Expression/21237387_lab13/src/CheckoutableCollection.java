import java.util.*;

public class CheckoutableCollection {

    private List<Checkoutable> pList;

    public CheckoutableCollection() {
        this.pList = new ArrayList<Checkoutable>();
    }

    public static void main(String[] args) {
        new CheckoutableCollection().runApp();
    }

    public void runApp() {
        addPublications();

        //test the methods here...

        //showKidsMagazineByAge(6);


    }

    public void addPublications() {
        pList.add(new Book("Cindy and the Candy Factory", "AA Press", "Ben Don"));
        pList.add(new Book("Secret Code", "Ma House", "Dim Green"));

        pList.add(new Megazine("Living", "Person", 5, 3));
        pList.add(new Megazine("Cooking", "Person", 3, 10));

        pList.add(new KidsMegazine("Tinkering", "Teens world", 3, 10, 6, 12));
        pList.add(new KidsMegazine("My Dream", "Teens world", 8, 5, 3, 6));

        pList.forEach(checkoutable -> {
            checkoutable.checkout();
            System.out.println("Return Date: "+checkoutable.returnDate()+"\n");
        });





    }


}

