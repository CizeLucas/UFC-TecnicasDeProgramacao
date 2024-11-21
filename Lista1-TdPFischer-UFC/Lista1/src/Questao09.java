import java.util.Scanner;

public class Questao09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite A: ");
		int A =	Integer.parseInt(scanner.nextLine());
		System.out.print("Digite B: ");
		int B = Integer.parseInt(scanner.nextLine());	

		if(A>10 && A+B==20) {
			System.out.println("A + B == 20");
		} else {
			System.out.println("número não válido");
		}
		
		scanner.close();
	}

}
