import java.util.Scanner;

public class Lab6_Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value 1: ");
		int v1 = scan.nextInt();
		System.out.println("Enter value 2: ");
		int v2 = scan.nextInt();
		
		System.out.println("Before swapping: " + v1 + ", " + v2);
		int v3 = v1;
		v1 = v2;
		v2 = v3;
		
		System.out.println("After swapping: " + v1 + ", " + v2);
	}

}
