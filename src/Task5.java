import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        //В одновимірному масиві, що складається з n дійсних елементів, обчислити:
        //1) кількість елементів, що лежать в діапазоні від А до В (А і В – з клавіатури);
        //2) суму елементів масиву, розташованих після максимального елемента.

        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("Завдання 1");
        int[] array = {1, 5, 11, 21, 69, 28, 5, 25};

        System.out.println("введіть число початку діапазону");
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        System.out.println("введіть число кінця діапазону");
        int secondNum = scanner.nextInt();
        int countElements = 0;
        int max = array[0];

        if (firstNum > secondNum) {
            int temp = firstNum;
            firstNum = secondNum;
            secondNum = temp;
        }

        for(int i=0;i<array.length;i++){
            if(array[i]>firstNum && array[i]<secondNum){
                countElements++;
            }
            if(max < array[i]){
                max = array[i];
            }
        }

        System.out.println("Кількість елементів в діапазоні між введеними числами - " + countElements);
        System.out.println("Елементи після максмального - ");
        boolean isAfter = false;
        for (int i=0; i<array.length;i++){
            if(isAfter == false){
                if(array[i]==max){
                    isAfter = true;
                }
            }
            else {
                System.out.println(array[i]);
            }
        }



        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println(" ");

    }
}
