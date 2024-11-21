import java.util.Scanner;

public class Questao10A {

		
	public static void main(String[] args) {
	        
		Scanner scan = new Scanner(System.in);
	        
	    System.out.print("Digite o tamanho da matriz (quadrada): ");
	    int numLimit;
	    numLimit = Integer.parseInt(scan.nextLine());
	    System.out.println();
	        
	    for (int numA=0; numA<numLimit; numA++){ 
	    	for (int numB=0; numB<=numA; numB++){
	                System.out.printf("%d   ", numB);
	            }
	        System.out.println();
	    }   
	     
	    scan.close();
	}


}
