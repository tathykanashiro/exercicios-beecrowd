import java.util.Scanner;

public class bee1005 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        double A = s.nextDouble();
        double B = s.nextDouble();

        double media = ((3.5*A)+(7.5*B))/11;

        System.out.printf("MEDIA: %.5f%n", media );

        s.close();
    }
}
