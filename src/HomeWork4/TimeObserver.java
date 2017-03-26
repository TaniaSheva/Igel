package HomeWork4;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeObserver {
	private String name;
	
	public void updateWithDate (Date date) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println(this.name + ":" + dateFormat.format(date)); 
	}
	
	public TimeObserver (String name) {
		this.name = name;
	}

}
