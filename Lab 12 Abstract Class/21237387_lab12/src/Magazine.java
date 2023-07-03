public class Magazine extends Publication {
    private int volumeNumber;
    private int issueNumber;

    public Magazine(String title, String publisher,int volumeNumber, int issueNumber) {
        super(title, publisher);
        this.issueNumber=issueNumber;
        this.volumeNumber=volumeNumber;
    }

    @Override
    public void print() {
        System.out.println(
                "Title: "+getTitle()+
        "\nPublisher: "+getPublisher()+
        "\nVolume: "+volumeNumber+
        "\nIssue: "+issueNumber
        );
    }
}
