import java.util.Scanner;

public class Funcao13 {
	
	public static int[] SearchRepeatedElements(int vector1[], int vector2[]) {
		int maxSize;
		int indexRptNumbers=0;
		
		if(vector1.length > vector2.length) {
			maxSize = vector1.length;
		} else {
			maxSize = vector2.length;
		}
		
		int repeatedNumbers[] = new int[maxSize];
		
		for(int i=0; i<vector1.length; i++) 
			for(int j=0; j<vector2.length; j++) 
				if(vector1[i] == vector2[j]) {
					repeatedNumbers[indexRptNumbers] = vector1[i];
					indexRptNumbers++;
				}
		
		return repeatedNumbers;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sizeVector;
		
		System.out.print("Insira o tamanho do primeiro vetor: ");
		sizeVector = Integer.parseInt(scan.nextLine());
		int vector1[] = new int[sizeVector];
		for(int i=0; i<sizeVector; i++) {
			System.out.print("Digite um numero: ");
			vector1[i] = Integer.parseInt(scan.nextLine());
		}
				
		System.out.print("Insira o tamanho do segundo vetor: ");	
		sizeVector = Integer.parseInt(scan.nextLine());
		int vector2[] = new int[sizeVector];
		for(int i=0; i<sizeVector; i++) {
			System.out.print("Digite um numero: ");
			vector2[i] = Integer.parseInt(scan.nextLine());
		}
		
		int repeatedNumbers[] = SearchRepeatedElements(vector1, vector2);
		
		System.out.print("Os numeros que estao presentes nos dois vetores acima sao: ");
		for(int i=0; i<repeatedNumbers.length && repeatedNumbers[i]!=0; i++) 
			System.out.print(repeatedNumbers[i]+", ");
	
		scan.close();
	}

}
