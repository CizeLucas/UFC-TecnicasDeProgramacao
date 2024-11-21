import java.util.Scanner;

public class Questao10F {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
	    System.out.print("Digite o tamanho da matriz (quadrada): ");
	    int numLimit = Integer.parseInt(scan.nextLine());
	    System.out.println();
	    int cte = numLimit/2;
	    
	    for(int l=0; l<numLimit; l++) {
	    	for(int c=0; c<numLimit; c++) {	
	    		if(l==c || l+c==(numLimit-1)) {
	    			System.out.print(c+" ");
	    		} else {
	    			System.out.print("* ");
	    		}
	    	}
	    	System.out.println();
	    }	    
	    scan.close();
	}

}
