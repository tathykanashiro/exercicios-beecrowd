import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero, numeroHorasTrabalhadas;
		double valorHora, salario;
				
		numero = sc.nextInt();
		numeroHorasTrabalhadas = sc.nextInt();
		valorHora = sc.nextDouble();
		
		salario = valorHora * numeroHorasTrabalhadas;
		
		System.out.println("NUMBER = " + numero);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();
	}

}