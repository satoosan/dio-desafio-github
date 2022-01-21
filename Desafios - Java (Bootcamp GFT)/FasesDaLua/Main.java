import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int inicio = leitor.nextInt();
        int fim = leitor.nextInt();
        
        if (inicio >= 0 && fim <= 2) {
            System.out.println("nova");
        }else if(inicio > 3 && fim <= 96){
            System.out.println("minguante");
        }else if(inicio <= 3 && fim <= 97){
            System.out.println("crescente");
        }else{
            System.out.println("cheia");
        }
        
    }
}