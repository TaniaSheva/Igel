package HomeWork4;

public class UseTimeServer {
	public static void main(String[] args) throws InterruptedException {
		
		TimeServer timeServer1 = new TimeServer(5); //first implementation
		TimeServer timeServer2 = new TimeServer(10); //second implementation
		
		TimeObserver timeObserver1 = new TimeObserver("First observer");
		TimeObserver timeObserver2 = new TimeObserver("Second observer");
		
		timeServer1.addObserver(timeObserver1);
		timeServer2.addObserver(timeObserver2);
		Thread.sleep(16000);
		timeServer1.removeObserver(timeObserver1); //встигає кілька разів нотіфайнутись і видаляється
		timeServer2.removeObserver(timeObserver2); //встигає нотіфайнутись 1 раз і видаляється
	}

}
