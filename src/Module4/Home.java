package Module4;

public class Home {
	public void test(){
		
	}
	
	public void test(int a){
		
	}
	
	
	
	public int color;
	private Window window = new Window();
	
	// �� �����������
	public Home(int baseColor){
		color = baseColor;
		
	}
	
	public Home(){
		color = 10;
		
	}
	//���������� ���� �������� �����
	//public Home(){
	//	color = 0;
	//	window = null;
	//}
	
	public void paint(int c){
		color = c;
		rePaint();
	}
	public void replaceWindow(Window w){
		window = w;
	}
private void rePaint(){
	window.close();
	}

}
