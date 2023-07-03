import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScheduleBookTester {

    List<Event> aList;

    public ScheduleBookTester() {
        aList = new ArrayList<>();
    }

    public static void main(String[] args) throws Exception {
        new ScheduleBookTester().runApp();

    }

    public void runApp() throws Exception {

        loadEvents();

        System.out.print("Enter the date(YYYY MM DD): ");
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        int month = in.nextInt();
        int day = in.nextInt();
        printEventsOn(year, month, day);

    }


    public void loadEvents() throws Exception{

        aList.add(new OnetimeEvent("See dentist", 2030, 5, 2));
        aList.add(new OnetimeEvent("Mary's Birthday", 2030, 12, 23));
        aList.add(new OnetimeEvent("Christmas Party", 2030, 12, 25));
        aList.add(new OnetimeEvent("Visit Bob", 2030, 11, 12));
        aList.add(new OnetimeEvent("Visit Ada", 2030, 11, 5));
        aList.add(new MonthlyEvent("Pay Bills", 5));
        aList.add(new MonthlyEvent("Visit Dad", 2));
        aList.add(new MonthlyEvent("Visit Dad", 23));
        aList.add(new DailyEvent("Yoga class"));

    }


    public void printEventsOn(int year, int month, int day) {
        for (Event a : aList) {
            if (a.occursOn(year, month, day)) {
                System.out.println(a);
            }
        }
    }

}
