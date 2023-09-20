import java.util.Scanner;
public class Q1{
	public static void main (String[] args){
		Greet obj1 = new Greet();
		Greet obj2 = new Greet("Priyansh");
	}
}
	class Greet{
		Greet(){
		System.out.println("Hello, how are you?");
		}
		
		Greet(String name){
			System.out.println("Hello " + name + ", how are you?");
		}
	}
