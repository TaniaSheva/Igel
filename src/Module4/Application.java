package Module4;

public class Application {

	public static void main(String[] args) {

	Home a = new Home(400); //ссылка на дом a в памяти
	Window w= new Window();
	w.open();
	a.replaceWindow(w);
	a.color = 30;
	
	Home b = new Home(200); //ссылка на дом b в памяти
	b.paint(100);
	
	Home c = new Home(300); //ссылка на дом c в памяти
	c.paint(100);

	}

}
