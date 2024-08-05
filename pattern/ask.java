package pattern;

public class ask {
    public static void main(String[] args) {
        int row = 6;

        for (int i = 1; i <= row; i++) {
            for (int j = 0; j < i; j++) {
                if (i % 2 != 0) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = row ; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (i % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
