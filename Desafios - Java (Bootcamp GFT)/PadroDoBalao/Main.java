import java.io.IOException;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws IOException {
	  
		Scanner leitor = new Scanner(System.in);
		
		while (leitor.hasNext()) {
		  
		  // ABCDEFGHIJKLMNOPQRSTUVWXYZ
			String alphabet = leitor.next(); //Alfabeto
			
			String word = ""; // 
			
			int letters = leitor.nextInt(); // Indica as lampadas que foram piscadas
			
			//char art
			for (int i = 0; i < letters; i ++) {
				
				int lamp = leitor.nextInt() - 1;
				word = word + alphabet.charAt(lamp);
				
			}
			System.out.println(word);
		}
	}
}