import java.util.Scanner;
import java.util.Random;

public class Questao03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int numSecreto = 1+random.nextInt(100);
		int inputNum;
		System.out.println("Advinhe um numero secreto de 1 a 100:");
		
		do {
			System.out.print("Digite sua tentativa: ");
			inputNum = Integer.parseInt(scanner.nextLine());
			
			if(inputNum!=numSecreto)
				if(inputNum < numSecreto) {
					System.out.println("Dica: O numero que voce digitou eh MENOR que o numero secreto!\n\n");
				} else {
					System.out.println("Dica: O numero que voce digitou eh MAIOR que o numero secreto!\n\n");
				}
		}while(inputNum != numSecreto);
			
		System.out.printf("Parabens! Voce acertou! o numero secreto era %d.", numSecreto);

		scanner.close();
	}

}
