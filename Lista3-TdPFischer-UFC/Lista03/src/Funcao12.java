import java.util.Scanner;

public class Funcao12 {
	
	public static boolean CheckPrime(int num) {
		
		for(int i=2; i<(num-1); i++) 
			if(num%i==0)
				return false;

		return true;
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Insira um numero: ");
		int num = Integer.parseInt(scan.nextLine());
		
		if(CheckPrime(num)){
			System.out.printf("\n O numero %d eh primo!", num);
		} else {
			System.out.printf("\n O numero %d nao eh primo.", num);
		}

		scan.close();
	}

}
