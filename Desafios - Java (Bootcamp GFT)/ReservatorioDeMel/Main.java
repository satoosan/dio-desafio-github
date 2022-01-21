import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

class Main {
  public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	DecimalFormat df = new DecimalFormat("0.00");
    	double V, D, R, areaB, altura;
    	while (leitor.hasNext()) {
    		V = leitor.nextDouble(); //Volume
    		D = leitor.nextDouble(); //Diametro
    		R = D / 2;
    		
    		//V = π∙r2∙h
    		altura = V / (3.14*Math.pow(R,2));
    		
    		areaB = 3.14 * Math.pow(R, 2);
    		
    		
    		System.out.println("ALTURA = " + df.format(altura));
    		System.out.println("AREA = " + df.format(areaB));
    	}
    }
}