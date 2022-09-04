import java.util.Scanner;
import java.util.Locale;

public class SimpleCalculate {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		String produto1 = scan.nextLine();
		String produto2 = scan.nextLine();
		String [] produto1split = produto1.split(" ");
		String [] produto2split = produto2.split(" ");
		int codigo = Integer.parseInt(produto1split[0]);
		int quantidade = Integer.parseInt(produto1split[1]);
		float valor = Float.parseFloat(produto1split[2]);
		int codigo2 = Integer.parseInt(produto2split[0]);
		int quantidade2 = Integer.parseInt(produto2split[1]);
		float valor2 = Float.parseFloat(produto2split[2]);
		float total = (quantidade * valor) + (quantidade2 * valor2);
		String strDouble = String.format(Locale.US, "%.2f", total);
		System.out.println("VALOR A PAGAR: R$ " + strDouble);
		
		
		scan.close();
	}
}
