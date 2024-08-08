package pointer;

public class numElements {
    static boolean isMaxEle(int arr[], int n, int x) {
        int i, lastIndex = 0;
        lastIndex = (n % 2 == 0) ? n / 2 : n / 2 + 1;
        for (i = 0; i < lastIndex; i++) {
            if (arr[i] == x && arr[i + n / 2] == x)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 3, 3, 3, 4 };
        int n = arr.length;
        int x = 3;
        if (isMaxEle(arr, n, x)){
            System.out.println("Max element is present in the array");
        }else{
            System.out.println("Max element is not present in the array");
        }
    }
}
