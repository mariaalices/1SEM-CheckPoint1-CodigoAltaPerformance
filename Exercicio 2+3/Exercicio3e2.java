import java.util.Random;
import java.util.Scanner;
//CARLOS EDUARDO RM: 552611
//MARIA ALICE RM: 552717
//THAIS MARI RM: 553620
public class Exercicio3e2 {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner e = new Scanner(System.in);
		
		System.out.println("Informe o nome completo: ");
		//Aqui já criei a variavel e o "toLowerCase" foi usado para deixar tudo em letra minuscula
		String nomeCompleto = e.nextLine().toLowerCase();
		
		String login = criandoLogin(nomeCompleto);
		
		System.out.println("Nome completo: " + nomeCompleto);
		System.out.println("Login: " + login);

		// DEFININDO AS STRINGS COM OS DADOS NECESSARIOS
		String letraMAIUS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String letrasMINUS = "abcdefghijklmnopqrstuvwxyz";
		String num = "0123456789";
		String caracEspec = "!@#$%¨¬§.;/°?<>^&*()-_+=";

		// VARIAVEIS PARA A SENHA E CONTADORES DE CARACTER.
		char[] senha = new char[12];
		int cMAIUS = 0;
		int cMINUS = 0;
		int cNUM = 0;
		int cESPEC = 0;

		// PREENCHENDO A SENHA 
		for (int i = 0; i < 12; i++) {
			int tipo = r.nextInt(4); // SEPARA ENTRE 0,1,2,3 PARA SELECIONAR O CARACTER

			if (tipo == 0 && cMAIUS < 3) {
				// LETRA MAIUSCULA
				senha[i] = letraMAIUS.charAt(r.nextInt(letraMAIUS.length()));
				cMAIUS++;
			} else if (tipo == 1 && cMINUS < 3) {
				// LETRA MINUSCULA
				senha[i] = letrasMINUS.charAt(r.nextInt(letrasMINUS.length()));
				cMINUS++;
			} else if (tipo == 2 && cNUM < 3) {
				// NUMERO
				senha[i] = num.charAt(r.nextInt(num.length()));
				cNUM++;
			} else if (tipo == 3 && cESPEC < 3) {
				// CARACTERE ESPECIAL
				senha[i] = caracEspec.charAt(r.nextInt(caracEspec.length()));
				cESPEC++;
			} else {
				// SE SELECIONAR MAIS DE 3 VEZES PRECISAMOS RESETAR A ULTIMA RODADA DO FOR
				// I-- PARA TENTAR DE NOVO
				i--;
			}
		}

		// EXIBINDO A SENHA
		System.out.print("Senha gerada: ");
		for (int i = 0; i < senha.length; i++) {
			System.out.print(senha[i]);
		}
		System.out.println();
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
