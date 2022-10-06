import java.util.Scanner;

public class Lab6_Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the rectangle: ");
		int length = scan.nextInt();
		
		System.out.println("Enter the height of the rectangle: ");
		int height = scan.nextInt();
		
		if (length == height) {
			System.out.println("The rectangle is a perfect square");
		} else {
			System.out.println("The rectangle is not a perfect square");
		}
	}

}
