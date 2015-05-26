import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by LazarusX on 15/5/25.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        while (in.hasNext()) {
            double length = in.nextDouble();
            if (length == 0.00) {
                break;
            }
            System.out.println(getCardNumber(length) + " card(s)");
        }
    }

    public static int getCardNumber(double length) {
        int i = 1;
        double l = i / (i + 1.0);
        while (l < length) {
            i++;
            l += 1 / (i + 1.0);
        }

        return i;
    }
}
