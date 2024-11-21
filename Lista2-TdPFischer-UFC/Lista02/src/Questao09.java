import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Questao09 {

	    public static void permute(int[] vector, int start, List<int[]> permutations) {
	        if (start == vector.length - 1) {
	            permutations.add(vector.clone());
	        } else {
	            for (int i = start; i < vector.length; i++) {
	                swap(vector, start, i);
	                permute(vector, start + 1, permutations);
	                swap(vector, start, i);
	            }
	        }
	    }
	    
	    public static void swap(int[] vector, int i, int j) {
	        int temp = vector[i];
	        vector[i] = vector[j];
	        vector[j] = temp;
	    }
	    
	    public static void main(String[] args) {
	    	Scanner scan = new Scanner(System.in);
	    	System.out.print("Digite quantas letras voce quer inserir: ");
			int numChars = Integer.parseInt(scan.nextLine());
			char inputChar[] = new char[numChars];
			int[] vector = new int[numChars];
			
			for(int i=0; i<numChars; i++) {
				System.out.print("Digite um caractere: ");
				inputChar[i] = scan.nextLine().toUpperCase().charAt(0);
			}
			
			for(int i=0; i<numChars; i++) {
				vector[i]=i;
			}

	        List<int[]> permutations = new ArrayList<>();
	        permute(vector, 0, permutations);
	        
	        System.out.println();
	        for (int[] permutation : permutations) {
	            for(int i=0; i<permutation.length; i++) {
	            	System.out.print(inputChar[permutation[i]]);
	            }
	            System.out.println();
	        }
	        
	        scan.close();
	    }

		
		
}


