public abstract class Publication {
    private String title;
    private String publisher;

    public Publication(String title, String publisher){
        this.title=title;
        this.publisher=publisher;
    }

    public String getTitle(){
        return title;
    }

    public String getPublisher(){
        return publisher;
    }

    public void print(){
        System.out.println("Title: "+this.title +
                "\nPublisher: "+this.publisher);

    }
}
