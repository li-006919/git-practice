package zuoyie;

import java.util.Scanner;

public class d09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[10][10];
        for (int i = 0; i < 10; i++) {
            arr[i][0] = 1;
            arr[i][i] = 1;
        }
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < i; j++) {
                arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
            }
        }
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print(arr[i][j] + "\t" + "\t");
                        if (j == i) {
                            System.out.println();
                        }
                    }
                }
                break;
            case 2:
                for (int i = 0; i < 10; i++) {
                    for (int k = 0; k <= 30 - i - i - i; k++) {
                        System.out.printf(" ");
                    }
                    for (int j = 0; j <= i; j++) {
                        System.out.print(arr[i][j] + "     ");
                        if (j == i) {
                            System.out.println();
                        }
                    }
                }
        }
    }
}

