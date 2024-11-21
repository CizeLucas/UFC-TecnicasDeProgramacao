import java.util.Scanner;

public class Funcao20 {
	
	public static int[] ShortenVector(int SizeVector, int vector[]) {
		int sizeVector = vector.length;
		int vectorMatrix[][] = new int[sizeVector][sizeVector];
		
		for(int i=0; i<sizeVector; i++) {
			//System.out.print(i+" ");
			for(int j=0; j<(sizeVector-i); j++) {
				//System.out.print(vector[j]);
				vectorMatrix[i][j]=vector[j];
			}
			//System.out.println();
		}
		
		int reducedVector[] = new int[1];
		reducedVector[0] = vectorMatrix[(sizeVector-1)][0];
		
		return reducedVector;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int vectorSize;
		
		System.out.print("Insira o tamamho desejado para o vetor: ");
		vectorSize = Integer.parseInt(scan.nextLine());
		
		int vector[] = new int[vectorSize];
		
		for(int i=0; i<vector.length; i++) {
			System.out.print("Insira um numero: ");
			vector[i] = Integer.parseInt(scan.nextLine());
		}
		
		int finalVector[] = ShortenVector(vector.length, vector );
		
		System.out.printf("O conteudo do vertor inserido acima reduzido para uma posicao eh: %d", finalVector[0]);
		
		scan.close();
	}

}
