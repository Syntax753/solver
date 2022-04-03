package y2022.qualification.chainreations;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    // TODO Add Node support for graph problems
    // private class Node

    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            int C = sc.nextInt();
            System.out.println(C);

            int[] N = new int[C];
            for (int j = 0; j < C; j++) {
                N[j] = sc.nextInt();
            }

            int[] E = new int[C];
            for (int j = 0; j < C; j++) {
                E[j] = sc.nextInt();
            }

            System.out.println("Case #" + i + ": " + solve(N, E));
        }

        sc.close();
    }

    private static String solve(int[] nodes, int[] edges) {

        return Arrays.toString(nodes) + " " +Arrays.toString(edges);
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
