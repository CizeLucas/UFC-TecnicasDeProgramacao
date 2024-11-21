import java.util.Scanner;

public class Questao10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite A: ");
		int A =	Integer.parseInt(scanner.nextLine());
		System.out.print("Digite B: ");
		int B = Integer.parseInt(scanner.nextLine());	

		if(!(A>10)) {
			System.out.println("número menor que 10");
		}
		
		if(A+B!=20) {
			System.out.println("número diferente de 20");
		}
		
		scanner.close();
	}

}
