import java.util.Scanner;

public class Questao10B {
	
	public static void main(String[] args) {
        
		Scanner scan = new Scanner(System.in);
	        
	    System.out.print("Digite o tamanho da matriz (quadrada): ");
	    int numLimit = Integer.parseInt(scan.nextLine());
	    System.out.println();
	    
	    for (int numA=0; numA<numLimit; numA++){
	    	
            for (int numB=0; numB<numLimit && numA%2==0; numB++){
                if(numB%2==0){
                	System.out.print("@   ");
                } else {
                	System.out.print("*   ");
                }
            }
            
            for (int numB=0; numB<numLimit && numA%2!=0; numB++){
                if(numB%2==0){
                	System.out.print("*   ");
                } else {
                	System.out.print("@   ");
                }
            }
            
            System.out.println(); 
	    }
	    
	    scan.close();
	}
	
}
