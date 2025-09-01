import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Main
{
	public static void main(String[] args) {
	LocalDate myobj = LocalDate.now();
	System.out.println(myobj);
	LocalTime t = LocalTime.now();
	System.out.println(t);
	LocalDateTime dt = LocalDateTime.now();
	System.out.println(dt);
	DateTimeFormatter obj = DateTimeFormatter.ofPattern("dd-MM-YYYY--E d a G");
	DateTimeFormatter obj1 = DateTimeFormatter.ISO_LOCAL_DATE;
	String date = dt.format(obj);
	System.out.println("Today date is " + date);

	
	}		  
}
