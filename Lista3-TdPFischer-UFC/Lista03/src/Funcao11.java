import java.util.Scanner;

public class Funcao11 {
	
	public static int Exponentiation(int base, int expoent) {
		if(expoent>1) 
			base = base * Exponentiation(base, expoent-1);
		
		return base;
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Insira a base e em seguida o expoente: ");
		System.out.printf("A operacao resulta em: %d", Exponentiation(Integer.parseInt(scan.nextLine()), Integer.parseInt(scan.nextLine())));
		
		scan.close();
	}

}
