import java.util.Scanner;

public class Questao12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite A: ");
		int A =	Integer.parseInt(scanner.nextLine());
		System.out.print("Digite B: ");
		int B = Integer.parseInt(scanner.nextLine());	

		if(A>10) {
			System.out.println("A > 10");
		} else if(A+B==20) {
			System.out.println("A + B == 20");
		} else {
			System.out.println("números não válidos");
		}
		
		System.out.println("Sejam bem-vindos à disciplina de Técnicas de Programação");
		
		scanner.close();
	}

}
