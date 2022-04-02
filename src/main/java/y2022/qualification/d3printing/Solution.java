package y2022.qualification.d3printing;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            int[] levels = new int[]{sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};

            levels[0] = Math.min(sc.nextInt(), levels[0]);
            levels[1] = Math.min(sc.nextInt(), levels[1]);
            levels[2] = Math.min(sc.nextInt(), levels[2]);
            levels[3] = Math.min(sc.nextInt(), levels[3]);

            levels[0] = Math.min(sc.nextInt(), levels[0]);
            levels[1] = Math.min(sc.nextInt(), levels[1]);
            levels[2] = Math.min(sc.nextInt(), levels[2]);
            levels[3] = Math.min(sc.nextInt(), levels[3]);

            int max = 1_000_000;

            for (int j = 0; j < 4 && max >= 0; j++) {
                levels[j] = Math.min(max, levels[j]);
                max -= levels[j];
            }

            if (max == 0) {
                System.out.println("Case #" + i + ": " + Arrays
                        .stream(levels)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(" "))
                );
            } else {
                System.out.println("Case #" + i + ": IMPOSSIBLE");
            }
        }

        sc.close();
    }
}
