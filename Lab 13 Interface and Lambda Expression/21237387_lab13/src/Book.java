import java.time.LocalDate;

public class Book extends Publication implements Checkoutable{

    private String author;
    private LocalDate checkoutDate;


    public Book(String title, String publisher, String author) {
        super(title, publisher);
        this.author = author;
        this.checkoutDate = LocalDate.now();
    }

    public void print(){
        String str = String.format("Title: %s\nPublisher: %s\nAuthor: %s\n", getTitle(), getPublisher(), author);
        System.out.print(str);
    }

    @Override
    public void checkout() {
        this.checkoutDate = LocalDate.now();
        print();
        System.out.println("Checkout Date: "+checkoutDate.toString());
    }

    @Override
    public LocalDate returnDate() {
        return checkoutDate.plusDays(15);
    }
}
