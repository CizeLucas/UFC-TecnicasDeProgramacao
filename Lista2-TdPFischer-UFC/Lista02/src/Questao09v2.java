import java.util.Scanner;

public class Questao09v2 {

	public static int factorial(int num){
		int factorial=1;
		for(int i=num; num>1; num--) {
			factorial = num*factorial;
		}
		return factorial;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
    	System.out.print("Digite quantas letras voce quer inserir: ");
		int numChars = Integer.parseInt(scan.nextLine());
		char inputChar[] = new char[numChars];
		int[] vector = new int[numChars];
		int cte = factorial(numChars);
		int permutations[][] = new int[cte/numChars][numChars];
		
		for(int i=0; i<numChars; i++) {
			System.out.print("Digite um caractere: ");
			inputChar[i] = scan.nextLine().toUpperCase().charAt(0);
		}
		
		for(int i=0; i<numChars; i++) {
			vector[i]=i;
		}
		
		//matrix[i][j] -> i linha // j coluna
		// i = index (quantidade) dos conjuntos de permutacoes 
		// j = acessa cada permutacao de um conjunto
		
		
		for(int i=0; i<cte; i++) {
			
		}
		
		
		for(int i=0; i<cte; i++) {
			
			for(int j=0; j<numChars; j++) {
				
				if(j==cte/(cte/numChars-1)) {
					permutations[i][j] = vector[1];
				}
				
				if(j==cte/(cte/numChars-j)) {
					
				}
					permutations[i][j] = vector[j];
				
			}
			
			
		}
			
		
		
		

	}

}
