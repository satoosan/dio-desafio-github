import java.util.Scanner;

/* 
 Desafio
  Leia um valor inteiro N. Apresente todos os números entre 1 e 10000 que divididos por N dão resto igual a 2.

 Saída
  Exiba a variável PROD conforme exemplo abaixo, tendo obrigatoriamente um espaço em branco antes e depois da igualdade.
*/

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A, B, PROD;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		PROD =  A * B; //implemente o código que representa a multiplicação.
		
		System.out.println("PROD = " + PROD);
		
		sc.close();
		
	}

}