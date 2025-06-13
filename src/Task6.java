import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        //Ввести вхiднi данi в першi 24 стрiчки i першi 7 стовбцiв. Обчислити середнє арифметичне значення елементiв кожної стрiчки
        //i записати його у 8-й стовпчик, а також середнє арифметичне кож-
        //ного стовпчика i записати його в 25-й рядок. Вiддрукувати одержану матрицю в загальноприйнятому виглядi.
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("Завдання 1");
        double[][] S = new double[25][8];


        for(int i=0; i<S.length-1;i+=2){
            S[i] = new double[]{1, 2, 3, 4, 5, 6, 7, 0};
        }
        for(int i=1; i<S.length-1;i+=2){
            S[i] = new double[]{2, 5, 7, 8, 3, 5, 6, 0};
        }
        S[24] = new double[]{0, 0, 0, 0, 0, 0, 0, 0};


        for(int i=0; i<S.length-1;i++){
            int sum = 0;
            for(int j=0; j<S[i].length-1;j++){
                sum+=S[i][j];
            }
            S[i][7] = (double) sum/7;
        }

        for(int j=0; j<8;j++){
            int sum = 0;
            for(int i=0; i<25; i++){
                sum+=S[i][j];
            }
            S[24][j] = (double) sum/24;
        }

        for (int i = 0; i < S.length; i++) {
            for (int j = 0; j < S[i].length; j++) {
                System.out.print(S[i][j] + "   ");
            }
            System.out.println();
        }

        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println(" ");
    }
}
