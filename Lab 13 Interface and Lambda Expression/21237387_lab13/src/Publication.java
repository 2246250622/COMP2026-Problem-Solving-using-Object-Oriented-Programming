public abstract class Publication {
    private String title;
    private String publisher;

    public Publication(String title, String publisher) {
        this.title = title;
        this.publisher = publisher;
    }
    public void print(){
        String str =String.format("Title: %s\nPublisher: %s\n", title, publisher);
        System.out.print(str);
    }


    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }
}
