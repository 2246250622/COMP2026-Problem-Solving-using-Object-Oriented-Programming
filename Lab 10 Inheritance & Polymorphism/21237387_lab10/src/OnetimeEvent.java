public class OnetimeEvent extends Event{
    public OnetimeEvent(String description,int year, int month, int day){
        super(description, year, month,day);
    }

    public String toFileString(){
        return "Onetime " +getYear()+" "+ getMonth()+" " +getDay()+" "+ getDescription();
    }

    public String toString() {
        return getDescription()+"(One time) (id: "+getId()+")";
    }

}
