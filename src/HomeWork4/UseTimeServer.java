package HomeWork4;

public class UseTimeServer {
	public static void main(String[] args) {
		
		TimeServer timeServer1 = new TimeServer(10); //first implementation
		TimeServer timeServer2 = new TimeServer(5); //second implementation
		
		TimeObserver timeObserver1 = new TimeObserver("First observer");
		TimeObserver timeObserver2 = new TimeObserver("Second observer");
		
		timeServer1.addObserver(timeObserver1);
		timeServer2.addObserver(timeObserver2);
	}

}
