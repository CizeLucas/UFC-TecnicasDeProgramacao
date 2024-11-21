import java.util.Scanner;

public class Questao06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int sizeMatrix; 	int i;		int j;
		boolean isSimetric=true;
		
		System.out.println("Digite o tamanho da matriz quadrada a ser testada: ");
		sizeMatrix = Integer.parseInt(scan.nextLine());
		
		int matrix[][] = new int[sizeMatrix][sizeMatrix];
		//matrix[i][j] -> i linha // j coluna
		
		for(i = 0; i<sizeMatrix ;i++) {
			for(j = 0; j<sizeMatrix ;j++) {
				System.out.printf("Digite o elemento [%d, %d] da matriz: ", i, j);
				matrix[i][j] = 	Integer.parseInt(scan.nextLine());
			}
		}

		for(i = 0; i<sizeMatrix; i++) {
			for(j = 0; j<sizeMatrix && isSimetric==true; j++) {
				
				if(i!=j)
					if(matrix[i][j] != matrix[j][i]) {
						isSimetric=false;
					}
				
			}
		}
		
		if(isSimetric==true) {
			System.out.println("A matriz inserida eh simetrica!");
		} else {
			System.out.println("A matriz inserida NAO eh simetrica!");
		}
		
		
		}
		
}

