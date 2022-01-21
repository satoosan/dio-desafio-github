import java.io.IOException;
import java.util.Scanner;

class Main {
public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	
        //implemente o seu código aqui
        int password = 2002;
        
        int newPassword = leitor.nextInt();
        
        //2200
        //1020
        //2022
        //2002
        
        while(true){
          
          if(newPassword == password){
            System.out.println("Acesso Permitido");
            break;
          }else{
            System.out.println("Senha Invalida");
            newPassword = leitor.nextInt();
          }
          
        }
        
    }
}