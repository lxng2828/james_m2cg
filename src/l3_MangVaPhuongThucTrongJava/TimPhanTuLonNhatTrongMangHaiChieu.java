package l3_MangVaPhuongThucTrongJava;

import java.util.Scanner;

public class TimPhanTuLonNhatTrongMangHaiChieu {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap so hang: ");
        int m = s.nextInt();
        System.out.print("Nhap so cot: ");
        int n = s.nextInt();
        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Nhap phan tu a[%d][%d]: ", i, j);
                arr[i][j] = s.nextInt();
            }
        }

        System.out.println("Mang 2 chieu vua nhap la: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.printf("Phan tu lon nhat trong mang 2 chieu la: %d",findMax(arr));
        s.close();
    }

    public static int findMax(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}