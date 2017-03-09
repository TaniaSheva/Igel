package Inheritance;

public class Dog extends DomesticAnimal {
	

public void voice() {
	System.out.println("Gav Gav");
}

public void bite() {
	System.out.println("Bite");
	kill();
}
private void kill(){
	
}

public void sleep() {
	//do nothing
}

}
