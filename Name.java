//1. Write a program to print the name entered by user.


import java.util.Scanner; 

class Name {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  
    System.out.println("Enter your name");
    String Name = myObj.nextLine(); 
	System.out.println(Name);
  }
}