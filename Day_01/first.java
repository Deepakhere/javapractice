package Day_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// public class first {
//     @SuppressWarnings("resource")
//     public static void main(String[] args) {
//         System.out.println("Hello java");
//         int a, b, sum;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter any two number");
//         a = sc.nextInt();
//         b = sc.nextInt();
//         sum = a + b;
//         System.out.println("Sum of two number is " + sum);
//     }
// }

// public class first {
//     public static int checkGivenNum(int arr[], int givenNum){
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == givenNum) {
//                 return i;
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int[] arr = {2,3,5,6,1};
//         int givenNum = 6;
//         int check = checkGivenNum(arr,givenNum);
//         if (check > -1) {
//             System.out.println(check);
//         }else{
//             System.out.println("Number is not found");
//         }
//     }
// }

public class first {
    @SuppressWarnings("resource")
    public static void helperFun() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arrivalTime[] = new int[N];
        int departureTime[] = new int[N];

        for (int i = 0; i < N; i++) {
            arrivalTime[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            departureTime[i] = sc.nextInt();
        }
        int maxRunway = minRunways(N, arrivalTime, departureTime);
        System.out.println(maxRunway);
    }

    public static int minRunways(int N, int arrivalTime[], int departureTime[]) {
        List<int[]> itemValue = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            itemValue.add(new int[] { arrivalTime[i], 1 });
            itemValue.add(new int[] { departureTime[i], -1 });
        }
        itemValue.sort((a, b) -> a[0] == b[0] ? Integer.compare(a[1], b[1]) : Integer.compare(a[0], b[0]));

        int maxRunway = 0;
        int currRunway = 0;

        for (int[] item : itemValue) {
            currRunway += item[1];
            maxRunway = Math.max(maxRunway, currRunway);
            System.out.println(currRunway);
        }
        return maxRunway;
    }

    public static void main(String[] args) {
        helperFun();
    }
}