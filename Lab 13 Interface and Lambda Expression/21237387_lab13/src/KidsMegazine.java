public class KidsMegazine extends Megazine{
    private int minimumAge, maximumAge;

    public KidsMegazine(String title, String publisher, int volume, int issue, int minimumAge, int maximumAge) {
        super(title, publisher, volume, issue);
        this.minimumAge = minimumAge;
        this.maximumAge = maximumAge;
    }

    public void print(){
        String str =String.format("Title: %s\nPublisher: %s\nVolume: %s\nIssue: %s\nAge Range: %d-%d\n", getTitle(), getPublisher(), getVolume(), getIssue(), minimumAge, maximumAge);
        System.out.print(str);
    }

    public int getMinimumAge() {
        return minimumAge;
    }

    public int getMaximumAge() {
        return maximumAge;
    }
}
