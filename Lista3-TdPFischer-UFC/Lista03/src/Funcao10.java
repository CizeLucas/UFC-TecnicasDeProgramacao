import java.util.Scanner;

public class Funcao10 {

	public static boolean CheckVectorParity(int vector1[], int vector2[]) {
		
		if(vector1.length != vector2.length)
			return false;
	
		for(int i=0; i<vector1.length; i++) 
			if(vector1[i] != vector2[i])
				return false;

		return true;
		
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

		if(CheckVectorParity(vector1, vector2)) {
			System.out.println("Os vetores sao iguais! Com mesmo tamanho e conteudo");
		} else {
			System.out.println("Os vetores NAO sao iguais, com tamanho ou conteudos diferentes.");
		}
		

		scan.close();

	}

}
