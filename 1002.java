import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		
		double n = 3.14159;
		double raio, area;
		
		Scanner sc = new Scanner(System.in);
		
		raio = sc.nextDouble();
		
		area = n * Math.pow(raio, 2.0);
		
		System.out.printf("A=%.4f%n", area);
		
		sc.close();
	}

}