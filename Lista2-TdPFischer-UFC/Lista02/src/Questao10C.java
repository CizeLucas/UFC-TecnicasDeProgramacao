import java.util.Scanner;

public class Questao10C {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        
	    System.out.print("Digite o tamanho da matriz (quadrada): ");
	    int numLimit = Integer.parseInt(scan.nextLine());
	    System.out.println();
	    
	    //c -> coluna
	    //l -> linha
	    for(int l=0; l<numLimit; l++) {
	    	
	    	for(int c=0; c<numLimit; c++) {
	    		
	    		if(l%2==0) {
	    			if(numLimit/2==l) { //para testar se esta na linha do meio e substituir por '@'
	    				System.out.print('@'+" ");
	    			} else if(c==numLimit/2) {
	    				System.out.print('@'+" ");
	    			} else {
	    				System.out.print(numLimit-c-1+" ");
	    			}
	    			
	    		} else {
	    			
	    			if(numLimit/2==l) { //para testar se esta na linha do meio e substituir por '@'
	    				System.out.print('@'+" ");
	    			} else if(c==numLimit/2) {
	    				System.out.print('@'+" ");
	    			} else {
	    				System.out.print(c+" ");
	    			}
	    			
	    		}//fecha else do if principal
	    		
	    	} //fecha for da coluna
	    	System.out.println();
	    }//fecha for da linha
	    
	    scan.close();
	}

}
