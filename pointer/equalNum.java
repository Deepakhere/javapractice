package pointer;

import java.util.Scanner;

public class equalNum {
    public static long solution(int m, int n, int[] arr1, int[] arr2) {
        long count = 0;
        for(int i = 0; i < n; i++) {
            int j = 0;
            while(j<m) {
                if(arr1[j] == arr2[i]){
                    count++;
                    j++;
                }else{
                    j++;
                }
            }
        }
        return count;
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

        long result = solution(m, n, arr1, arr2);
        System.out.println(result);

        sc.close();
    }
}
