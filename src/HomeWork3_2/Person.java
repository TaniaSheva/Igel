package HomeWork3_2;

public class Person {
	String name;
	String surname;
	String email;
	
	Person (){

	}
	
	Person (String n, String s, String e){
		name = n;
		surname = s;
		email = e;
	}

	public void setName(String inputName){
		
		this.name = inputName;
		
	}
	public void setSurname(String inputSurname){
		
		this.surname = inputSurname;
		
	}
	public void setEmail(String inputEmail){
		
		this.email = inputEmail;
		
	}
	public String getName(){
		
		return this.name;
		
	}
	public String getSurname(){
		
		return this.surname;
		
	}
	public String getEmail(){
		
		return this.email;
		
	}
	
	public void pritnData(){
		System.out.println("Name is: " + getName());
		System.out.println("Surname is: " + getSurname());
		System.out.println("Email is: " + getEmail());
	}

}
