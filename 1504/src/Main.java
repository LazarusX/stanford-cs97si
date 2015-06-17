import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by LazarusX on 15/5/29.
 */
public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(addReversed(a, b));
        }
    }

    public static int addReversed(int a, int b) {
        return reverseInt(reverseInt(a) + reverseInt(b));
    }

    public static int reverseInt(int n) {
        if (n >= 0 && n < 10) {
            return n;
        }

        int reversed = 0;
        boolean zero = true;
        while (n > 0) {
            if (n % 10 != 0) {
                zero = false;
            }

            if (!zero) {
                reversed = reversed * 10 + n % 10;
            }

            n /= 10;
        }

        return reversed;
    }
}
