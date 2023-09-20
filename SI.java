//2. Write a program to calculate Simple Interest where user entered Principal amount, time and rate of interest. Take all the inputs in a single line and split the data.


import java.util.Scanner; 

class SI {
  public static void main(String[] args) {
 
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Amount, Time and Rate [Note: Maintain Space between each value]");
	//float data = sc.nextLine();
	float Amount = sc.nextFloat();
	float Time = sc.nextFloat();
	float Rate = sc.nextFloat();	
	float SI = (Amount*Time*Rate)/100;
	System.out.println("Simple Interest ==> ", SI);
  }
}