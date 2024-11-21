import java.util.Scanner;

public class Questao10E {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
	    System.out.print("Digite o tamanho da matriz (quadrada): ");
	    int numLimit = Integer.parseInt(scan.nextLine());
	    System.out.println();
	    int cte = numLimit/2;
	    
	    for(int l=0; l<numLimit; l++) {
	    	for(int c=0; c<numLimit; c++) {	
	    		
		    	if((numLimit%2==0 && (cte-1==c || cte==c)) || (numLimit%2!=0 && cte==c)) {
		    		System.out.print("|| ");
		    	} else if((numLimit%2==0 && (cte-1==l || cte==l)) || (numLimit%2!=0 && cte==l)) {
		    		System.out.print("= ");
		    	} else {
		    		if(l+c>=numLimit && l>cte && c>cte) {
		    			System.out.print("% ");
		    		} else if(l+c<numLimit && l<cte && c<cte){
		    			System.out.print("# ");
		    		} else if(l<c){
		    			System.out.print("! ");
		    		} else if(l>c){
		    			System.out.print("* ");
		    		}
		    	}
	    	}
	    	System.out.println();
	    }	    
	    scan.close();
	}

}
