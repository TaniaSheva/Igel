package Module4;

public class Window {
	private boolean isOpen;
	
	public void open() {
		System.out.println("before " + isOpen);
		if (!isOpen) {
			openWindow();
			isOpen = true;
		}
		System.out.println("after " + isOpen);
	}
	
	public void close(){
		if (isOpen) {
			isOpen = false;
		}
	}
private void openWindow() {
	System.out.println("State " + isOpen);
}

}
