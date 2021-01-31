import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ParticularDay {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month date year");
		int m = sc.nextInt();
		int d = sc.nextInt();
		int y = sc.nextInt();
		System.out.println(find(m,d,y));
		LocalDate date = LocalDate.now();//todays date
		LocalDate date1 = LocalDate.of(2020, 01, 01);//convert to date variable
		LocalDate date2 = date.plusDays(100);//adding 100 days
		System.out.println(date.compareTo(date1));//compare with 2 dates
		System.out.println(date.isLeapYear());//to check leap year
		System.out.println(date2);
		try{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-mm-dd HH:mm:ss");//format
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(dtf.format(ldt));//display time in given format
		}
		catch(Exception e) {
			
		}
		
	}
	static String find(int m,int d,int y) {
		LocalDate dat = LocalDate.of(y, m, d);
		return dat.getDayOfWeek().toString();
	}
	
}
