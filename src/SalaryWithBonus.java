import java.util.Scanner;
import java.util.Locale;

public class SalaryWithBonus {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		String nome = scan.nextLine();
		double salario = scan.nextDouble();
		double vendas = scan.nextDouble();
		double total = (vendas * 0.15) + salario;
		String strDouble = String.format(Locale.US, "%.2f", total);
		System.out.println("TOTAL = R$ " + strDouble);
		
		scan.close();
	}
}