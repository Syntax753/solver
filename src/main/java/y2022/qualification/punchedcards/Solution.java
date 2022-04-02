package y2022.qualification.punchedcards;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            System.out.println("Case #" + i + ":");

            StringBuilder sb = new StringBuilder();sb.setLength(0);

            int R = sc.nextInt();
            int C = sc.nextInt();

            String dl = "+-".repeat(C) + "+\n";
            String center = "|.".repeat(C) + "|\n";
            sb.append(dl);

            for (int r = 0; r < R; r++) {
                sb.append(center);
                sb.append(dl);
            }

            System.out.print(sb.replace(0, 2, "..").replace(C * 2 + 2, C * 2 + 3, "."));
        }

        sc.close();
    }
}
