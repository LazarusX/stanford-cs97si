import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by LazarusX on 15/5/25.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        double sum = 0;
        for (int i = 0; i < 12; i++) {
            sum += in.nextDouble();
        }

        System.out.printf("$%.2f\n", sum / 12);
    }
}
