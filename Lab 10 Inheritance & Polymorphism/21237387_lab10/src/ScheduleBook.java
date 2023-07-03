import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;

//write comments for your class and methods

public class ScheduleBook {

    private List<Event> aList;

    public ScheduleBook() {

        aList = new ArrayList<>();
    }

    public static void main(String[] args) throws Exception {
        new ScheduleBook().runApp();

    }

    public void runApp() throws Exception {
        Scanner in = new Scanner(System.in);
        outer:
        do{
            System.out.println("1. Load events from file\n" +
                    "2. Save event to file\n" +
                    "3. Show events\n" +
                    "4. Add event\n" +
                    "5. Remove event\n" +
                    "6. Quit\n");
            System.out.print("Option: ");
            switch (in.nextInt()){
                case 1:
                    System.out.print("Enter input filename: ");
                    System.out.println(loadEvents(in.next()) +" event(s) successfully read.");
                    break outer;
                case 2:
                    System.out.print("Enter output filename: ");
                    saveEvents(in.next());
                    break outer;
                case 3:
                    System.out.print("Enter the date(YYYY MM DD): ");
                    printEventsOn(Integer.parseInt(in.next()), Integer.parseInt(in.next()), Integer.parseInt(in.next()));
                    break outer;
                case 4:
                    System.out.print("Event type (onetime, daily or monthly) : ");
                    addEvent(in);
                    break outer;
                case 5:
                    System.out.print("Event event id: ");
                    removeEvent(in.nextInt());
                    break outer;
                case 6:
                    System.out.print("Bye~");
                    System.exit(0);
            }
        }while(true);


    }

    public void saveEvents(String filename) throws Exception {
        FileWriter myWriter = new FileWriter(filename);
        for (Event event: aList) {
            if (event instanceof OnetimeEvent){
                myWriter.write("Onetime " +event.getYear() +" " +event.getMonth()+" "+ event.getDay() + " "+event.getDescription()+"\n");
            }else if (event instanceof MonthlyEvent){
                myWriter.write("Monthly " + event.getDay() + " "+event.getDescription()+"\n");
            }else if (event instanceof DailyEvent){
                myWriter.write("Daily " +event.getDescription()+"\n");
            }
        }
        myWriter.close();
    }

    public int loadEvents(String filename) throws Exception {
        Scanner scanner = new Scanner(new File(filename));
        int looper = 0;
        while (scanner.hasNext()){
            String [] s = scanner.nextLine().split(" ");
            String detail = "";
            switch (s[0]){
                case "Onetime":
                    detail = "";
                    for (int i = 4; i < s.length; i++) {
                        detail +=s[i] +" ";
                    }
                    aList.add(new OnetimeEvent(detail, Integer.parseInt(s[1]), Integer.parseInt(s[2]), Integer.parseInt(s[3])));
                    break;
                case "Monthly":
                    detail = "";
                    for (int i = 2; i < s.length; i++) {
                        detail +=s[i]+" ";
                    }
                    aList.add(new MonthlyEvent(detail, Integer.parseInt(s[1])));
                    break;
                case "Daily":
                    detail = "";
                    for (int i = 1; i < s.length; i++) {
                        detail +=s[i]+" ";
                    }
                    aList.add(new DailyEvent(detail));
                    break;
            }
            looper++;
        }
    return looper;
    }

    public void addEvent(Scanner in) {
        switch (in.next()){
            case "onetime":
                System.out.print("Enter the date(YYYY MM DD): ");
                int yyyy = Integer.parseInt(in.next());
                int mm = Integer.parseInt(in.next());
                int dd = Integer.parseInt(in.next());
                System.out.print("Enter description: ");
                String description = in.next();
                aList.add(new OnetimeEvent(description, yyyy, mm , dd));
                break;
            case "monthly":
                System.out.print("Enter the day of month: ");
                int day = Integer.parseInt(in.next());
                System.out.print("Enter description: ");
                String description2 = in.next();
                aList.add(new MonthlyEvent(description2, day));
                break;
            case "daily":
                System.out.print("Enter description: ");
                String description3 = in.next();
                aList.add(new DailyEvent(description3));
                break;
        }
    }

    public void removeEvent(int id) {
        aList.removeIf(event -> event.getId() == id);
    }


    /**
     *  You are not allowed to modify this method
     *  Print all events occur on the given date
     * @param year - year of the event
     * @param month - month of the event
     * @param day - day of the event
     */
    public void printEventsOn(int year, int month, int day) {
        for (Event a : aList) {
            if (a.occursOn(year, month, day)) {
                System.out.println(a);
            }
        }
    }

}
