import java.util.Scanner;
//CARLOS EDUARDO RM: 552611
//MARIA ALICE RM: 552717
//THAIS MARI RM: 553620
public class Exercicio2 {

	public static void main(String[] args) {
			Scanner e = new Scanner(System.in);
			
			System.out.println("Informe o nome completo: ");
			//Aqui já criei a variavel e o "toLowerCase" foi usado para deixar tudo em letra minuscula
			String nomeCompleto = e.nextLine().toLowerCase();
			
			String login = criandoLogin(nomeCompleto);
			
			System.out.println("Nome completo: " + nomeCompleto);
			System.out.println("Login: " + login);			
			
			e.close();
		}
		
		public static String criandoLogin(String nomeCompleto) {
			
			//split = feito para separar os nomes em partes
			String separarNome[] = nomeCompleto.split(" ");
			
			//== 0 pq é o primeiro indice
			String primeiroNome = separarNome[0];
			//length pega a quantidade de arrays o vetor possui
			//o -1 é por conta do vetor comecar com 0
			String ultimoNome = separarNome[separarNome.length - 1];
			
			//charAt(0) pega a primeira letra de cada palavra
			if (separarNome.length >= 3) {
				return primeiroNome.charAt(0) + "" + separarNome[1].charAt(0) + ultimoNome;
			} else if (separarNome.length == 2) {
				return primeiroNome.charAt(0) + "" + separarNome[1].charAt(0) + ultimoNome;
			}
			
			
			
			return primeiroNome.charAt(0) + ultimoNome;

	}

}