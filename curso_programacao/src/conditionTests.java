import java.util.Locale;
import java.util.Scanner;

public class conditionTests {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		
		int minutos = sc.nextInt();
		double conta = 50.0;
		
		if ( minutos > 100) {
			
			conta += (2 * (minutos - 100));
			System.out.printf("Valor da conta = R$ %.2f%n", conta);
			
		} else {
			
			System.out.printf("Valor da conta = R$ %.2f%n", conta);
			
		}
		
		
		
		sc.close();
	}

}
