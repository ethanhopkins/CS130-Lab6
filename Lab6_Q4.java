import java.util.Scanner;

public class Lab6_Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of classes held: ");
		int held = scan.nextInt();
		System.out.println("Enter the number of classes attended: ");
		int attended = scan.nextInt();
		
		double percentage = held * .75;
		System.out.println("75% of the classes held are " + percentage + " classes");
		
		if (attended < percentage) {
			System.out.println("Ineligable for exam");
		} else {
			System.out.println("Eligable for exam");
		}
	}

}
