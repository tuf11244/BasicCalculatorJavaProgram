import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    System.out.println ("Hello World");
    Calendar c = Calendar.getInstance ();
    GregorianCalendar cal = new GregorianCalendar();
      System.out.println (c.getCalendarType ());
      System.out.println (c.getTimeZone ().getID ());
      System.out.println (c.getWeekYear ());
      System.out.println (c.getWeeksInWeekYear ());
      System.out.println (c.getTime ());
      System.out.println (c.get (Calendar.DATE));
      System.out.println (c.get (Calendar.HOUR_OF_DAY) + " " + c.get(Calendar.MINUTE) + " " + c.get(Calendar.SECOND));
      System.out.println("Please enter the number for the year that you want to check if its leap or not");
      Scanner console = new Scanner(System.in);
      int number = console.nextInt();
      System.out.println(cal.isLeapYear(number));

  }
}
