package y2022.qualification.d1_000_000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    private static String solve(int[] in) {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            int N = sc.nextInt();

            int[] dice = new int[N];
            while (--N >= 0) {
                dice[N] = sc.nextInt();
            }

            System.out.println("Case #" + i + ": " + solve(dice));
        }

        sc.close();
    }
}
