import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) throws IOException {
    Scanner leitor = new Scanner(System.in);

    // digite o seu código
    // SOMA ou MÉDIA
    char O = leitor.next().charAt(0);
    double soma = 0.0;

    // Matriz
    double[][] matriz = new double[12][12];

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        matriz[i][j] = leitor.nextDouble();
      }
    }

    // SOMA
    for (int i = 0; i < matriz.length; i++) {
      for (int j = i + 1; j < matriz[i].length; j++) {
        soma = soma + matriz[i][j];
      }
    }

    if (O == 'M') {
      // (144 - 12)/2
      soma = soma / 66.0;

    }
    System.out.println(String.format("%.1f", soma));
  }
}