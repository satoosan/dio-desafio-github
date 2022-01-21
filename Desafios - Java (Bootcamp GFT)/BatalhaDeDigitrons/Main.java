import java.io.IOException;
import java.util.Scanner;

class Main {
public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	
    	//Numeros de Instancias
    	int T = leitor.nextInt();
    	int B, A1, D1, L1, A2, D2, L2, V1, V2;
    	for (int i = 0; i < T; i++) {
    	  
    		B = leitor.nextInt(); // Valor Bonus
    		
    		// Digitron - Bruno
    		A1 = leitor.nextInt(); // Valor de Ataque
    		D1 = leitor.nextInt(); // Valor de Defesa
    		L1 = leitor.nextInt(); // Level do Treinador
    		
    		//Digitron - Guarte
    		A2 = leitor.nextInt(); // Valor de Ataque
    		D2 = leitor.nextInt(); // Valor de Defesa
    		L2 = leitor.nextInt(); // Level do Treinador

    		V1 = ((A1 + D1)/2) + (L1 % 2 == 0 ? B : 0); // Valor do Golpe - Bruno
    		V2 = ((A2 + D2)/2) + (L2 % 2 == 0 ? B : 0); // Valor do Golpe - Guarte
    		
        if (V1 > V2) System.out.println("Bruno");
    		else if (V1 < V2) System.out.println("Guarte");
    		else System.out.println("Empate");
    	}
    }
}