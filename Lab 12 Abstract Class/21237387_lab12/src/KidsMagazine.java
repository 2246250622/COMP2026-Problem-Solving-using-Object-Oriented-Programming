public class KidsMagazine extends Publication{
    private int volumeNumber;
    private int issueNumber;
    private int minimumAge;
    private int maximumAge;

    public KidsMagazine(String title, String publisher,int volumeNumber, int issueNumber,int minimumAge, int maximumAge) {
        super(title, publisher);
        this.issueNumber=issueNumber;
        this.volumeNumber=volumeNumber;
        this.minimumAge=minimumAge;
        this.maximumAge=maximumAge;

    }

    public int getMinimumAge(){
        return minimumAge;
    }

    public int getMaximumAge(){
        return maximumAge;
    }

    @Override
    public void print() {
        System.out.println(
                "Title: "+getTitle()+
                        "\nPublisher: "+getPublisher()+
                        "\nVolume: "+volumeNumber+
                        "\nIssue: "+issueNumber+
                        "\nAge Range: "+minimumAge+" - "+maximumAge
        );
    }



}
