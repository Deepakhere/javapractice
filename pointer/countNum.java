package pointer;

import java.util.Scanner;

public class countNum {
    public static int[] solution(int m, int n, int[] arr1, int[] arr2) {
        int count = 0;
        int j = 0;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            while (j < m && arr1[j] < arr2[i]) {
                count++;
                j++;
            }
            result[i] = count;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[] arr1 = new int[m];
        int[] arr2 = new int[n];

        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] result = solution(m, n, arr1, arr2);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

        sc.close();
    }
}
