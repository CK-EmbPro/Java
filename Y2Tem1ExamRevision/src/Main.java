// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

enum Day{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
};
class EnumTest {
    Day day;

    EnumTest(Day day) {
        this.day = day;
    }

    void tellDayInfo(){
        switch (day) {
            case MONDAY:
                System.out.println("this is monday");
                break;
            case TUESDAY:
                System.out.println("this is 2");
                break;
            case WEDNESDAY:
                System.out.println("this is 3");
                break;
            case THURSDAY:
                System.out.println("this is 4");
                break;
            case FRIDAY:
                System.out.println("this is 5");
                break;
            case SATURDAY:
                System.out.println("this is 6");
                break;
            default:
                System.out.println("no day 7");
                break;

        }
    }

}
public class Main {
    public static void main(String[] args) {
    EnumTest day1 = new EnumTest(Day.TUESDAY);
    day1.tellDayInfo();
    }

}