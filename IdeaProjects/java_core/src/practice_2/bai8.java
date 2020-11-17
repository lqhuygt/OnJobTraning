package practice_2;

import java.util.Scanner;

public class bai8 {
    /*
        Nhap so lieu cho mot ma tran cac so nguyen A cap m*n
        tim ma tran chuyen vi (ma tran chuyen vi m*n = n*m so hang
        se chuyen vi thanh so cot).
     */
    public static void main(String[] args) {
        int m, n;
        int[][] arr, brr;
        Scanner scanner = new Scanner(System.in);
        m = scanner.nextInt();
        n = scanner.nextInt();
        System.out.println("Nhap ma tran a[][]: ");
        arr = nhap(m, n, scanner);
        brr = chuyenvi(arr);

        System.out.println("Ma tran arr[][] goc:");
        show(arr);

        System.out.println("Ma tran chuyen vi la:");
        show(brr);
    }

    private static void show(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }

    private static int[][] chuyenvi(int[][] arr) {
        int m,n;
        m = arr.length;
        n = arr[0].length;

        int[][] brr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                brr[i][j] = arr[j][i];
            }
        }
        return brr;
    }

    private static int[][] nhap(int m, int n, Scanner scanner) {
        int[][] x = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                x[i][j] = scanner.nextInt();
            }
        }
        return x;
    }
}
