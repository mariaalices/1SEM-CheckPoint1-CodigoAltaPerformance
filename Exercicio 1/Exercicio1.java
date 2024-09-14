import java.util.Scanner;
//CARLOS EDUARDO RM: 552611
//MARIA ALICE RM: 552717
//THAIS MARI RM: 553620
public class Exercicio1 {

	public static void main(String[] args) {
		 Scanner e = new Scanner(System.in);
	        int num = 0;
	        
	        // VALIDA NÚMERO INSERIDO
	        while (num < 1 || num > 3999) {
	            System.out.print("Digite um número (1 a 3999): ");
	            num = e.nextInt();
	            
	            if (num < 1 || num > 3999) {
	                System.out.println("Número fora do intervalo. Tente de novo.");
	            }
	        }
	        
	        // DEFININDO OS VALORES DE ENTRADA
	        int[] valores = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
	        String[] simbolos = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
	        // ---- 4 E  SÃO NÚMEROS COMPOSTOS, ENTÃO FACILITA INSERIR AS DUAS LETRAS ----
	        // TESTANDO STRINGBUILDER :)
	        StringBuilder resul = new StringBuilder();
	        
	        // CONSTRUINDO NUM ROMANO
	        for (int i = 0; i < valores.length; i++) {
	            while (num >= valores[i]) {
	                resul.append(simbolos[i]);
	                num -= valores[i];
	            }
	        }
	        
	        // EXIBE O NUMERO FINAL
	        System.out.println("O número em algarismos romanos é: " + resul.toString());
	        
	        e.close();
	}

}