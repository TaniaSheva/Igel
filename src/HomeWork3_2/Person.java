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
		
		name = inputName;
		
	}
	public void setSurname(String inputSurname){
		
		surname = inputSurname;
		
	}
	public void setEmail(String inputEmail){
		
		email = inputEmail;
		
	}
	public String getName(){
		
		return name;
		
	}
	public String getSurname(){
		
		return surname;
		
	}
	public String getEmail(){
		
		return email;
		
	}

}
