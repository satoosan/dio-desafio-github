import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//impar + impar = branca
		//par + impar = preta
		//par + par = branca
		
		// 1 - branco
		// 0 - preta
		
		int L = sc.nextInt();
		int C = sc.nextInt();
		
		
		if ((L + C) % 2 ==0)
			System.out.println("1");
		else                                               //complete o código nos espaços em branco
			System.out.println("0");
		sc.close();
	}
}