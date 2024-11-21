import java.util.Scanner;

public class Funcao06 {

	public static void OrderVector(int vector[]) {
		int vectorLength =  vector.length;
		int temp=0;
		
		for(int i=0; i<vectorLength; i++) 
			for(int j=i+1; j<vectorLength; j++) {
				//System.out.printf("\nvector[%d]=%d // vector[%d]=%d", i,vector[i],j,vector[j]);
				if(vector[i] > vector[j]) {
					//System.out.print(" -> troca\n");
					temp = vector[i];
					vector[i] = vector[j];
					vector[j] = temp;
				}
			}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Insira o tamanho do vetor a ser ordenado: ");
		int sizeVector = Integer.parseInt(scan.nextLine());
		
		int vector[] = new int[sizeVector];
		
		for(int i=0; i<sizeVector; i++) {
			System.out.print("Digite um numero: ");
			vector[i] = Integer.parseInt(scan.nextLine());
		}
		
		OrderVector(vector);
		
		System.out.println("O vetor digitado acima em ordem crescente eh: ");
		for(int i=0; i<vector.length; i++) 
			System.out.print(vector[i]+", ");

		scan.close();
	}

}
