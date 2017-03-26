package HomeWork4;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Date;

public class TimeServer extends TimerTask {
	private int period;
	private Timer timer = new Timer ();
	private ArrayList <TimeObserver> observers = new ArrayList <TimeObserver> ();
	
	
	TimeServer (int t) { 
		period = t;
		timer.schedule(this, 0, period*1000);  
		
	}
	
	@Override
	public void run () {
		Date date = new Date ();
		notifyObservers(date);
	}
	
	public void addObserver (TimeObserver observer){
		observers.add(observer);
		
	}
	public void removeObserver (TimeObserver observer){
		observers.remove(observer);
	}
	private void notifyObservers (Date date) {
		for (TimeObserver observer: observers) {
			observer.updateWithDate(date);
		}
	}

}
