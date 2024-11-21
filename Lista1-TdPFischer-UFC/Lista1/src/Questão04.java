import java.util.Scanner;

public class Questão04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite A: ");
		int A = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Digite B: ");
		int B = scanner.nextInt();
		scanner.nextLine();
		
		if(A>10 || A+B==20) {
			System.out.println("número válido");
		} else if(A==B) {
			System.out.println("A eh igual B; A e B são diferentes de 10; A eh menor que 10");
		}
		
		scanner.close();
	}

}
