import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int tempoGastoHoras, velocidadeMedia;
		double litros;
				
		tempoGastoHoras = sc.nextInt();
		velocidadeMedia = sc.nextInt();
			
		litros = (double) tempoGastoHoras * velocidadeMedia / 12.0;
			
		System.out.printf("%.3f%n", litros);
		
		sc.close();
	}

}