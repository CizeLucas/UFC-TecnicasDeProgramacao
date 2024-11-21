
public class Main {

	public static void main(String[] args) {
		
		/*
		  
		  >>> Minhas considerações e coisas que não fiz ou não ficaram muito boas:
		  
			1) Variáveis das subclases das classes abstratas Clientes e Publicações não foram privadas 
		(e por isso não foi usado metodos get e set) por falta de tempo 
		(mas as das classes Biblioteca e Emprestimos foram privadas hehe);
		
			2) Implementação do limite de TPs e doação de livros para a biblioteca foi ruim/mal feita;
			
			3) Regras de negocio talvez mal definidas, com muitos If Else na classe biblioteca, 
		mas siceramente não achei outra solucao boa para evitar isso
		
			4) Os relatórios não ficaram iguais ao formato que foi pedido na atividade
			
			5) o relatorio de Histórico de emprestimo não foi feito
			
			-> Acho que foi isso [:)], de resto acho que está tudo aí
		
		
a) Encapsulamento - OK
b) Herança - OK
c) Polimorfismo - OK
d) Classe abstrata - OK
e) Construtores - OK
f) Sobrecarga de métodos - não foi necessário
g) Sobrescrita de métodos - OK
h) Exceções (próximo conteúdo) - não necessário / não obrigatório
i) Interface (Orientação a Objeto) (próximo conteúdo) - não foi necessário na minha opnião
		 */
		
		Biblioteca bblt = new Biblioteca();
		
		Livro l1 = new Livro(0, "Como programa em Java", "Deitel", "2022", 20);
		Livro l2 = new Livro(1, "Como ser aprovado em Tecnicas de Programacao", "Geovana & Caua", "2023", 10);
		Livro l3 = new Livro(2, "Como ser reprovado em Tecnicas de Programacao", "Cize Lucas", "2023", 2);
		Livro l4 = new Livro(3, "C Completo & Total", "Herbert Schildt", "1987", 5);
		Artigo a1 = new Artigo(0, "Um comparativo de desempenho entre Java e Python", "Silva",  "2021", 10);
		Artigo a2 = new Artigo(0, "Explicando porque a Disciplina de Tecnicas de Programacao (Fischer) eh tao dificil", "Cize Lucas",  "2022", 4);
		Revista r1 = new Revista(0, "Inclusao digital necessaria para sociedade atual", "Geovana & Caua", "2023", 10);
		
		bblt.adicionarPublicacao(l1);
		bblt.adicionarPublicacao(l2);
		bblt.adicionarPublicacao(l3);
		bblt.adicionarPublicacao(a1);
		bblt.adicionarPublicacao(r1);
		
		Professor p1 = new Professor("Rui", 8492);
		Professor p2 = new Professor("Fischer", 4028);
		
		Aluno c1 = new Aluno("Cize", 5864);
		Aluno c2 = new Aluno("Joao", 4581);
		Aluno c3 = new Aluno("Maria", 8934);
		Aluno c4 = new Aluno("Pedro", 3716);
		
		Servidor s1 = new Servidor("Fulano", 4825);
		Servidor s2 = new Servidor("Cicrano", 8420);
		
		bblt.emprestar(p2, a1); //demonstrando o limite de TPs
		bblt.emprestar(p2, l3);
		bblt.emprestar(p2, l1);
		System.out.println("\n\n");
		
		bblt.emprestar(s1, l3); //demonstrando o limite da quantidade de livros
		bblt.emprestar(c4, l3);
		System.out.println("\n\n");
		
		bblt.emprestar(p2, l3); //demonstrando caso o Cliente queira pegar um livro que ele ja tem emprestado
		System.out.println("\n\n");
		
		bblt.emprestar(c4, l1); 
		bblt.emprestar(c4, l2);
		bblt.emprestar(c4, l4);
		bblt.emprestar(c4, r1);
		bblt.emprestar(c4, a1);
		bblt.emprestar(c4, a2); //demonstando caso o Cliente atinja seu respectivo limite de emprestimos
		System.out.println("\n\n");
		
		bblt.consultarCliente(3716);
		System.out.println("\n\n");
		
		bblt.verClientes();
		System.out.println("\n\n");
		
		bblt.consultarCliente(5378);
		bblt.consultarCliente(4028);
		System.out.println("\n\n");
		
		bblt.buscarPublicacao("Como programa em Java");
		System.out.println("\n\n");
		
		bblt.listarPublicacoes();
		System.out.println("\n\n");
	
	}

}
