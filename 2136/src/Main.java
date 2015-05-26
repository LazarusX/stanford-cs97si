import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by LazarusX on 15/5/26.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int[] counts = new int[26];
        int max = 0;
        for (int i = 0; i < 4; i++) {
            String line = in.nextLine();
            for (int j = 0; j < line.length(); j++) {
                char c = line.charAt(j);
                if (c >= 'A' && c <= 'Z') {
                    counts[c - 'A']++;
                    if (counts[c - 'A'] > max) {
                        max = counts[c - 'A'];
                    }
                }
            }
        }

        for (int i = max; i > 0; i--) {
            for (int j = 0; j < 26; j++) {
                if (counts[j] >= i) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
                if (j != 25) {
                    System.out.print(' ');
                } else {
                    System.out.println();
                }
            }
        }

        for (int i = 0; i < 26; i++) {
            System.out.print((char) (i + 'A'));
            if (i != 25) {
                System.out.print(' ');
            } else {
                System.out.println();
            }
        }
    }
}
