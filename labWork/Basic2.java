package labWork;


import java.util.Scanner;
public class Basic2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value for i:");
		int i=scan.nextInt();
		System.out.println("Enter the value for j:");
		int j=scan.nextInt();
		
		int sum=i+j;
		
		System.out.println("The sum of i and j is...:"+sum);
	}
}