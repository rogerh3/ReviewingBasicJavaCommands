//Import Scanner
import java.util.Scanner;

public class Review {

	//function
	public static int doubley(int x) {
		return x * x;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating Scanner
		Scanner sc = new Scanner(System.in); 

		//using function
		int doubled = doubley(5);
		System.out.println(doubled);
		int anotherdouble = doubley(10);
		System.out.println(anotherdouble); 
		
		int num = 5;
		double num2 = 4.6;
		String name = "Roger";
		boolean home = false;
		
		System.out.println(num);
		System.out.println(num2);	
		
		//Basic if statement
		if (name == "Roger") {
			System.out.println("Happy Birthday");
		} else {
			System.out.println("Have a nice day");
		}
		
		//while loop
		while (num<18) {
			System.out.println("You are not an adult");
			//Count up
			num++;
		}
		
		//for loop
		for (int i = 0; i<20; i++) {
			System.out.println(i);
		}
		
		//do while loop
		int x = 0;
		do {
			System.out.println("Happy 4th");
			x++;
		} while(x<10);
		
		//Fibonnaci Sequence
		int k = 0, a = 1, b = 1;
		System.out.print("0 1 1");
		
		while (k<= 50) {
			k = a+b;
			System.out.print(" " + k + " ");
			a = b;
			b = k;
		}
		
		System.out.println("Enter any number: ");
		int i = sc.nextInt();
		System.out.print("0 1 1");
		int m = 0, n = 1, p = 1;
		
		while (m<=i) {
			m=n+p;
			System.out.print(" " + m + " ");
			n = p;
			p = m;
		}
			}
		
		
	
	}


