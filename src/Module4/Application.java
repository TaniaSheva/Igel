package Module4;

public class Application {

	public static void main(String[] args) {

	Home a = new Home(400); //������ �� ��� a � ������
	Window w= new Window();
	w.open();
	a.replaceWindow(w);
	a.color = 30;
	
	Home b = new Home(200); //������ �� ��� b � ������
	b.paint(100);
	
	Home c = new Home(300); //������ �� ��� c � ������
	c.paint(100);

	}

}
