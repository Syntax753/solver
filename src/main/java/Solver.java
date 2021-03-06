import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Solver {

    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            int[] in = new int[]{1, 2};

            System.out.println("Case #" + i + ": " + solve(in));
        }

        sc.close();
    }

    private static String solve(int[] in) {
        // TODO: representative default operation
        Arrays.sort(in);

        int cnt = 0;
        for (int j : in) {
            if (j <= cnt) {
                continue;
            }
            cnt++;
        }

        return String.valueOf(cnt);
    }

    private static String solve(long[] in) {
        // TODO: representative default operation
        Arrays.sort(in);

        int cnt = 0;
        for (long j : in) {
            if (j <= cnt) {
                continue;
            }
            cnt++;
        }

        return String.valueOf(cnt);
    }
}
