import java.util.Scanner;
import java.util.Locale;

public class Salary {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		int numero = scan.nextInt();
		int horas = scan.nextInt();
		float horasfloat = horas;
		float valor = scan.nextFloat();
		float salario = valor * horasfloat;
		System.out.println("NUMBER = " + numero);
		String strDouble = String.format(Locale.US, "%.2f", salario);
		System.out.println("SALARY = U$ " + strDouble);
		
		scan.close();
	}
}
