package pattern;

public class sec {
    public static void main(String[] args) {
        int row = 6;

        for (int i = 1; i < row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); //j,i
            }
            System.out.println();
        }
    }
}
