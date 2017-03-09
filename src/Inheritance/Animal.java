package Inheritance;

public class Animal {
	private String name;
	private int satiety;
	public String getName(){
		return name;
		
	}
public String setName(){
		return name;
	}
	

public boolean move (){
	if (satiety>1)
	satiety--;
	return true;
	
}
public void feed (){
	if (satiety<100) {
		satiety++;
	}
	
}

}
