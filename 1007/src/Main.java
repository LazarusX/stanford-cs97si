import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by LazarusX on 15/5/26.
 */
public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = cin.nextInt();
        int m = cin.nextInt();
        cin.nextLine();
        Sequence[] sequences = new Sequence[m];
        for (int i = 0; i < m; i++) {
            sequences[i] = new Sequence(cin.nextLine());
        }

        Arrays.sort(sequences);

        for (int i = 0; i < m; i++) {
            System.out.println(sequences[i]);
        }
    }

    public static class Sequence implements Comparable {
        String string;
        int inversionCount;

        public Sequence(String string) {
            this.string = string;
            calculateInversionCount();
        }

        private void calculateInversionCount() {
            int inversionCount = 0;
            int[] charCounts = new int[3];
            for (int i = 0; i < this.string.length(); i++) {
                switch (string.charAt(i)) {
                    case 'A':
                        inversionCount += charCounts[0] + charCounts[1] + charCounts[2];
                        break;
                    case 'C':
                        charCounts[0]++;
                        inversionCount += charCounts[1] + charCounts[2];
                        break;
                    case 'G':
                        charCounts[1]++;
                        inversionCount += charCounts[2];
                        break;
                    case 'T':
                        charCounts[2]++;
                }
            }

            this.inversionCount = inversionCount;
        }

        @Override
        public int compareTo(Object o) {
            if (o == null) {
                throw new NullPointerException();
            }

            if (o instanceof Sequence) {
                return this.inversionCount - ((Sequence) o).inversionCount;
            }

            return -1;
        }

        @Override
        public String toString() {
            return this.string;
        }
    }
}
