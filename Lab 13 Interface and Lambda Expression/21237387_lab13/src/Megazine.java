import java.time.LocalDate;

public class Megazine extends Publication implements Checkoutable{

    private int volume;
    private int issue;
    private LocalDate checkoutDate;



    public Megazine(String title, String publisher, int volume, int issue) {
        super(title, publisher);
        this.volume = volume;
        this.issue = issue;
    }
    
    @Override
    public void print(){
        String str =String.format("Title: %s\nPublisher: %s\nVolume: %s\nIssue: %s\n", getTitle(), getPublisher(), volume, issue);
        System.out.print(str);
    }

    public int getVolume() {
        return volume;
    }

    public int getIssue() {
        return issue;
    }

    @Override
    public void checkout() {
        this.checkoutDate = LocalDate.now();
        print();
        System.out.println("Checkout Date: "+checkoutDate.toString());
    }

    @Override
    public LocalDate returnDate() {
        return checkoutDate.plusDays(7);
    }
}
