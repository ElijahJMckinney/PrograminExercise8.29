package progexec;

import java.util.Arrays;
import java.util.Scanner;

public class IdenticalArrays {

    /** Return true if m1 and m2 contain identical elements */
    public static boolean equals(int[][] m1, int[][] m2) {
        if (m1.length != m2.length) {
            return false;
        }

        // Sort each row in both arrays
        for (int i = 0; i < m1.length; i++) {
            Arrays.sort(m1[i]);
            Arrays.sort(m2[i]);
        }

        // Compare sorted arrays
        for (int i = 0; i < m1.length; i++) {
            if (!Arrays.equals(m1[i], m2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input for the first array
        System.out.print("Enter list1: ");
        int[][] list1 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list1[i][j] = input.nextInt();
            }
        }

        // Input for the second array
        System.out.print("Enter list2: ");
        int[][] list2 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list2[i][j] = input.nextInt();
            }
        }

        // Check if arrays are identical
        if (equals(list1, list2)) {
            System.out.println("The two arrays are identical");
        } else {
            System.out.println("The two arrays are not identical");
        }
    }
}
