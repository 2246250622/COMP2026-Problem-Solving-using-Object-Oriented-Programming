import java.util.*;

public class BookInfo {

    private List<Publication> pList;

    public BookInfo() {
        this.pList = new ArrayList<Publication>();
    }

    public static void main(String[] args) {
        new BookInfo().runApp();
    }

    public void runApp() {
        addPublications();
        showAllPublications();
        //test the methods here...

    }

    public void addPublications() {
        pList.add(new Book("Cindy and the Candy Factory", "AA Press", "Ben Don"));
        pList.add(new Book("Secret Code", "Ma House", "Dim Green"));
        pList.add(new Magazine("Living", "Person", 5,3));
        pList.add(new Magazine("Cooking", "Person", 3,10));
        pList.add(new KidsMagazine("Tinkering", "Teens World", 3,10, 6, 12));
        pList.add(new KidsMagazine("Tinkering", "Teens World", 3,11, 6, 12));
        pList.add(new KidsMagazine("Tinkering", "Teens World", 3,12, 6, 12));
        pList.add(new KidsMagazine("My Dream", "Teens World", 8,5, 3, 6));




    }

    public void showAllPublications() {
        for(int i =0;i<pList.size();i++){
            if(pList.get(i) instanceof Publication ){
                pList.get(i).print();
                System.out.println();
            }
        }

    }

    public void showAllBooks() {
        for(int i =0;i<pList.size();i++){
            if(pList.get(i) instanceof Book ){
                pList.get(i).print();
                System.out.println();
            }
        }


    }

    public void showAllMagazines() {
        for(int i =0;i<pList.size();i++){
            if(pList.get(i) instanceof Magazine ){
                pList.get(i).print();
                System.out.println();
            }
        }


    }

    public void showAllKidsMagazines(){
        for(int i =0;i<pList.size();i++){
            if(pList.get(i) instanceof KidsMagazine ){
                pList.get(i).print();
                System.out.println();
            }
        }


    }

    public void showKidsMagazineByAge(int age){
        for(int i =0;i<pList.size();i++){
            if(pList.get(i) instanceof KidsMagazine && age > ((KidsMagazine) pList.get(i)).getMinimumAge() && age <((KidsMagazine) pList.get(i)).getMaximumAge()){
                pList.get(i).print();
                System.out.println();
            }
        }


    }

    public void showPublicationByTitle(String s) {
        for(int i =0;i<pList.size();i++){
            if(pList.get(i) instanceof Publication &&pList.get(i).getTitle().equals(s)){
                pList.get(i).print();
                System.out.println();
            }
        }


    }
}

