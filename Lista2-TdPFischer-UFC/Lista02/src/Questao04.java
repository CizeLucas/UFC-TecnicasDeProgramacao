import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {
		//numMultip1 x numMultip2 = product
		Scanner scan = new Scanner(System.in);
		int numMultip1=1;
		
		System.out.println("Calculadora de Tabuada!\nDigite um numero: ");
		int numMultip2 = Integer.parseInt(scan.nextLine());
		
		while(numMultip1<=10) {
		System.out.printf("%d x %d = %d\n",numMultip1, numMultip2, numMultip1*numMultip2);
			numMultip1++;
		}
		
		scan.close();	
	}

}