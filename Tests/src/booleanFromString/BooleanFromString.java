package booleanFromString;

public class BooleanFromString {
	public static void main(String[] args){
		String hello = "true";
		Boolean hello2 = false;
		
		hello2 = Boolean.valueOf(hello);
		
		if(hello2){
			System.out.println("the transfer from string to Boolean worked");
		}else{
			System.out.println("the transfer from string to Boolean did not work");
		}
	}
}
