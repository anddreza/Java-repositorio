package beecrowd;
import java.io.IOException;
import java.util.Scanner;

    public class test1014 {

        public static void main(String[] args) throws IOException {
            Scanner leitor = new Scanner(System.in);
            int km = leitor.nextInt();
            double liters = leitor.nextDouble();
            double calculoKmLitro = km / liters;
            System.out.println(String.format("%.3f km/l", calculoKmLitro));

        }

    }
