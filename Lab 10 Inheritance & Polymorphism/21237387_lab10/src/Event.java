//you are not allowed to modify this class.
import java.util.*;

/**
 * The Event class represent an event in a schedule book
 */
public class Event {

    private int id; //unique identifier
    private String description; //description of the event
    private GregorianCalendar date; //date of the event
    private static int numOfEvents; // total number of events created

    /**
     * Constructor
     * @param description - description of the event
     * @param year  - year of the event
     * @param month - month of the event
     * @param day - day of the event
     */
    public Event(String description, int year, int month, int day) {
        this.description = description;
        this.date = new GregorianCalendar(year, month-1, day);
        this.id = ++numOfEvents;
    }

    /**
     * Check whether this Event occurs on the specified date
     * @param year - year of the specified date
     * @param month - month of the specified date
     * @param day - day of the specified date
     * @return ture if this Event occurs on the specified date, false otherwise
     */
    public boolean occursOn(int year, int month, int day) {
        return getYear() == year &&
                getMonth() == month &&
                getDay() == day;
    }


    /**
     *
     * @return the string representation of this Event
     */
    public String toString() {
        return description;
    }

    /**
     *
     * @return the string representation of this Event that is going to be saved into a file
     */
    public String toFileString(){
        return description;
    }

    /**
     *
     * @return the id of this Event
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return the description of this Event
     */
    public String getDescription() {
        return description;
    }

    /**
     * Update the description of this Event
     * @param description - new description of this Event
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return the year in the date of this Event
     */
    public int getYear() {
        return date.get(Calendar.YEAR);
    }

    /**
     * Update the year in the date of this Event
     * @param year
     */
    public void setYear(int year) {
        this.date.set(Calendar.YEAR, year);
    }

    /**
     *
     * @return return the month in the date of this Event
     */
    public int getMonth() {
        return date.get(Calendar.MONTH)+1;
    }

    /**
     * Update the month in the date of this Event
     * @param month
     */
    public void setMonth(int month) {
        this.date.set(Calendar.MONTH, month-1);
    }

    /**
     *
     * @return the day in the date of this Event
     */
    public int getDay() {
        return date.get(Calendar.DAY_OF_MONTH);
    }

    /**
     * Update the day in the date of this Event
     * @param day
     */
    public void setDay(int day) {
        this.date.set(Calendar.DAY_OF_MONTH, day);
    }

}
