import java.util.Scanner;

public class Funcao19 {
	
	public static boolean CheckPerfectNumber(int num) {
		int sumDeviders=0;
		
		for(int i=1; i<=num && num!=i; i++) 
			if(num%i==0)
				sumDeviders = sumDeviders + i;	
		
		if(sumDeviders == num) 
			return true;
		
		return false;	
	}
	
	public static void main(String[] args) {
		Scanner sacaner = new Scanner(System.in);
		int numInput;
		
		System.out.print("Insira um numero: ");
		numInput = Integer.parseInt(sacaner.nextLine());
		
		if(CheckPerfectNumber(numInput)) {
			System.out.println("O numero inserido eh perfeito!");
		} else {
			System.out.println("O numero inserido NAO eh perfeito!");
		}

		sacaner.close();
	}

}
