package pointer;

public class Merge {
    public static void mergeArray(int[] arr1, int m, int[] arr2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n -1;

        while (j >= 0) {
            if (i >= 0 && arr1[i] > arr2[j]) {
                arr1[k] = arr1[i];
                i--;
            }else{
                arr1[k] = arr2[j];
                j--;
            }
            k--;
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,0,0,0};
        int m = 3;
        int[] arr2 = {2,5,6};
        int n = 3;

        mergeArray(arr1, m, arr2, n);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
        }     
    }
}
