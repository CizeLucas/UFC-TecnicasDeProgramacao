
public class Questao01 {

	public static void main(String[] args) {

		for(int numero=1; numero<=100; numero++) {
			if(numero%2==0) {
				System.out.print(numero+", ");
			}
			if(numero%20==0) {
				System.out.println();
			}
		}
	}
}
