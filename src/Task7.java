import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        //Реалізувати програму, яка міняє місцями останній рядок і перший стовпець
        //квадратної матриці.
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("Завдання 1");
        int[][] S = new int[4][4];


        S[0] = new int[]{1, 2, 3, 4};
        S[1] = new int[]{1, 2, 3, 4};
        S[2] = new int[]{1, 2, 3, 4};
        S[3] = new int[]{1, 2, 3, 4};


        for (int i = 0; i < S.length; i++) {
            for (int j = 0; j < S[i].length; j++) {
                System.out.print(S[i][j] + " ");
            }
            System.out.println();
        }


        int[] lastRow = new int[]{0, 0, 0, 0};
        int[] firstColumn = new int[]{0, 0, 0, 0};
        for(int i=0; i<4; i++){
            lastRow[i] = S[3][i];
            firstColumn[i] = S[i][0];
        }

        System.out.println(" ");

        for(int i=0; i<4; i++){
            S[i][0]=lastRow[i];
            S[3][i]=firstColumn[i];
        }


        for (int i = 0; i < S.length; i++) {
            for (int j = 0; j < S[i].length; j++) {
                System.out.print(S[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println(" ");
    }
}
