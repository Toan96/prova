import java.util.Calendar;
import java.util.GregorianCalendar;

public class greg {

	public static void main(String[] args) {
		GregorianCalendar data = null;
		data = new GregorianCalendar();
		System.out.println(data);
		data.add(Calendar.YEAR, 45);
		GregorianCalendar data1 = data;
		System.out.println(data1);
	}

}
