import java.util.Scanner;

public class Questão03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite A: ");
		int A = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Digite B: ");
		int B = scanner.nextInt();
		scanner.nextLine();
	
		if(A==10) {
			System.out.println("A == 10");
		}
		
		if(A+B==20) {
			System.out.println("A + B == 20");
		}
		
		if(B==10) {
			System.out.println("B == 10");
		}
		
		scanner.close();
	}

}
