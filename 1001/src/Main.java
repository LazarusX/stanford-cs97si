import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by LazarusX on 15/5/25.
 */
public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println(a + b);
    }
}
