import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        //Органiзувавши керований ввiд, ввести ряд чисел i сформувати масив з тих, якi
        //задовольняють певну умову (див. нижче). Перебачити довжину масиву не бiльше 10
        //елементiв.
        //Для непарних варiантiв - впорядкувати масив по зростанню,
        //Дiйснi числа такi, що квадратнi коренi з їх модулiв меншi 3.1415.

        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("Завдання 1");
        int maxElements = 10;
        int amountaddded = 0;
        int[] numbers = new int[10];
        while (amountaddded < maxElements){
            System.out.println("Введіть число для додавання в масив (введіть 0 щоб зупитнити ввід)");
            Scanner scanner = new Scanner(System.in);
            double number = scanner.nextDouble();
            if(number == 0){
                break;
            }
            else if (Double.isFinite(number) && Math.sqrt(Math.abs(number)) < 3.1415) {
                System.out.println("Число додано до масиву");
                int toPush = (int) number;
                numbers[amountaddded] = toPush;
                amountaddded++;
            }
            else {
                System.out.println("Число не пройшло перевірку і не було додано");
            }
        }

        System.out.println("Ввід завершено");
        int sumOfPos = 0;
        int amountOfPos = 0;
        int multOfNeg = 1;
        int amountOfNeg = 0;
        int avg = 0;
        int[] newArray = new int[amountaddded];
        int counter = 0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]!=0){
                newArray[counter] = numbers[i];
                counter++;
                if(numbers[i]>0){
                    sumOfPos+=numbers[i];
                    amountOfPos++;
                }
                else{
                    multOfNeg*=numbers[i];
                    amountOfNeg++;
                }
                avg+=numbers[i];
            }
        }

        avg = avg/newArray.length;

        Arrays.sort(newArray);

        for(int i=0;i<newArray.length;i++){
            System.out.println(newArray[i]);
        }

        System.out.println("");
        System.out.println("Кількість додатніх - " + amountOfPos);
        System.out.println("Кількість від`ємних - " + amountOfNeg);
        System.out.println("Сума додатніх - " + sumOfPos);
        System.out.println("Добуток від'ємних - " + multOfNeg);
        System.out.println("Середнє арифметичне - " + avg);



        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println(" ");

    }
}
