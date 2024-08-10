package pointer;

public class maxMin {
    static int getMin(int arr[], int n) {
        int res = arr[0];
        for (int i = 1; i < n; i++)
            res = Math.min(res, arr[i]);
        return res;
    }

    static int getMax(int arr[], int n) {
        int res = arr[0];
        for (int i = 1; i < n; i++)
            res = Math.max(res, arr[i]);
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int n = arr.length;
        System.out.println("Maximum element is " + getMax(arr, n));
        System.out.println("Minimum element is " + getMin(arr, n));
    }
}
