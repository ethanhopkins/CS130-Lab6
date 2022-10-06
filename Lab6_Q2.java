import java.util.Scanner;

public class Lab6_Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length 1: ");
		int l1 = scan.nextInt();
		System.out.println("Enter length 2: ");
		int l2 = scan.nextInt();
		System.out.println("Enter the hypotenuse: ");
		int h1 = scan.nextInt();
		
		if (l1 + 1 == l2) {
			if (l2 + 1 == h1) {
				System.out.println("A triangle with side1 of " + l1 + (", a side2 of " + l2 + (", and a hypotenuse of " + h1 + " is a right triangle")));
			} else {
				System.out.println("A triangle with side1 of " + l1 + (", a side2 of " + l2 + (", and a hypotenuse of " + h1 + " is not a right triangle")));
			}
		} else {
			System.out.println("A triangle with side1 of " + l1 + (", a side2 of " + l2 + (", and a hypotenuse of " + h1 + " is not a right triangle")));
		}
	}

}
