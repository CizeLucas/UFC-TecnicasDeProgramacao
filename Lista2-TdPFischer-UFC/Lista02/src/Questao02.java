import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inputNum=0;
		int sumNum=0;
		
		System.out.println("Digite os Numeros:");
		do {
			sumNum = sumNum + inputNum;
			inputNum = Integer.parseInt(scanner.nextLine());
		}while(inputNum>=0);
		
		System.out.printf("A soma dos numeros positivos digitados foi: %d", sumNum);

		scanner.close();
	}

}
