import java.util.Scanner;

public class Lab6_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your word: ");
		String word = scan.next();
		
		if (word.length() % 2 == 0) {
			System.out.println(word + " has an even number of characters");
		} else {
			System.out.println(word + " has an odd number of characters");
		}
	}

}
