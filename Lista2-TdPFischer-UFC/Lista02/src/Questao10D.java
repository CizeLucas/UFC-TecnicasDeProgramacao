import java.util.Scanner;

public class Questao10D {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        
	    System.out.print("Digite o tamanho da matriz (quadrada): ");
	    int numLimit = Integer.parseInt(scan.nextLine());
	    System.out.println();
	    
	    
	    for(int l=0; l<numLimit; l++) {
	    	
	    	
	    	for(int c=0; c<numLimit && l==0; c++) {
	    		System.out.print(c+" ");
	    	}
	    	
	    	for(int c=numLimit-1; c>=0 && l+1==numLimit; c--) {
	    		System.out.print(c+" ");
	    	}
	    	
	    	for(int c=0; c<numLimit && l!=0 && l+1!=numLimit; c++) {
	    		if(c==0) {
	    			System.out.print(l+" ");
	    		} else if(c+1==numLimit) {
	    			System.out.print(numLimit-(l+1)+" ");
	    		} else {
	    			System.out.print('*'+" ");
	    		}
	    	}
	    	
	    	System.out.println();
	    }
	    
	    
	    scan.close();
	}

}
