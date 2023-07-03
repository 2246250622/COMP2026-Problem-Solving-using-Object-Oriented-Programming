public class MonthlyEvent extends Event {

    public MonthlyEvent(String description, int day) {
        super(description, 0, 0, day);
    }

    public String toString() {
        return getDescription() + "(One time) (id: " + getId() + ")";
    }
    public String toFileString(){
        return "Monthly " +getDay()+" "+ getDescription();
    }



    public boolean occursOn(int year, int month, int day) {
        if ((getMonth() == 1 && getDay() <= 31) || (getMonth() == 2 && getDay() <= 28) || (getMonth() == 3 && getDay() <= 31) ||
                (getMonth() == 4 && getDay() <= 30) || (getMonth() == 5 && getDay() <= 31) || (getMonth() == 6 && getDay() <= 30) ||
                (getMonth() == 7 && getDay() <= 31) || (getMonth() == 8 && getDay() <= 31) || (getMonth() == 9 && getDay() <= 30) ||
                (getMonth() == 10 && getDay() <= 31) || (getMonth() == 11 && getDay() <= 30) || (getMonth() == 12 && getDay() <= 31)
                && getDay() == day){
            return true;}else{
            return false;
        }
    }
}
