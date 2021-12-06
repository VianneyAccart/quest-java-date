import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
import java.util.Scanner; 

class TestDate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please fill a day (1-31) :");
        int day = sc.nextInt();
        System.out.println("Please fill a month (1-12) :");
        int month = sc.nextInt();
        System.out.println("Please fill a year :");
        int year = sc.nextInt();
        sc.close();

        // Set the right format in the instance of SimpleDateFormat
        SimpleDateFormat newDate = new SimpleDateFormat("MM-dd-yyyy");
        // Use datas from Scanner in my instance of GregorianCalendar
        Calendar calendar = new GregorianCalendar(year, month-1, day);
        Date date = calendar.getTime();
        // Get day of week from 1 (sunday) to 7 (saturday)
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        // Print the result in the console
        System.out.println("The date is : " + newDate.format(date));
        System.out.println("The day of week is : " + (dayOfWeek));       
    }
}