import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static String secondTask(int[] numbers){
        StringBuilder output = new StringBuilder();
        process(numbers, 0, 0, 0, output);
        return output.toString();
    }

    private static void process(int[] arr, int index, int sum, int count, StringBuilder output) {
        if (index >= arr.length) {
            if (count == 0) {
                output.append("Від'ємних чисел не введено\n");
            } else {
                double avg = (double) sum / count;
                output.append("Сума від'ємних: ").append(sum).append("\n");
                output.append("Кількість: ").append(count).append("\n");
                output.append("Середнє: ").append(avg).append("\n");
            }
            return;
        }

        int num = arr[index];
        output.append("Введено число: ").append(num).append("\n");
        if (num < 0) {
            sum += num;
            count++;
        }

        process(arr, index + 1, sum, count, output);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Написати програму, у якi вводилися б три числа i виводилися в порядку зростання.
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("Завдання 1");


        int[] numbers = new int[3];
        System.out.print("Введіть три числа: ");
        System.out.println("");
        for (int i = 0; i < 3; i++) {
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);

        System.out.println("У порядку зростання:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("");

        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println(" ");


        //Не використовуючи операторiв циклу, ввести ряд чисел i знайти суму, кiлькiсть i середне арифметичне
        //вiд'емних. Ввiд припинити пiсля вводу 0.
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("Завдання 2");
        int[] numbers = new int[4];
        System.out.println("Введіть число 1");
        numbers[0]=scanner.nextInt();
        System.out.println("Введіть число 2");
        numbers[1]=scanner.nextInt();
        System.out.println("Введіть число 3");
        numbers[2]=scanner.nextInt();
        System.out.println("Введіть число 4");
        numbers[3]=scanner.nextInt();

        String result = secondTask(numbers);
        System.out.println("\n=== Результат ===");
        System.out.println(result);

        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println(" ");


        //Написати програму, у якiй вводилася б кiлькiсть жителiв мiста (у тис.чл), i визначалося: мале воно
        //(<100 тис.чл), середне (100-400 тис.чл), велике (400 тис-мiльйон), мiльйнер (бiльше мiльйона).
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("Завдання 3");
        System.out.println("Введіть кількість жителів міста");
        int citizens = scanner.nextInt();
        if(citizens<100000){
            System.out.println("Мале місто");
        }
        else if (citizens>=100000 && citizens<400000) {
            System.out.println("Середнє місто");
        }
        else if (citizens>=400000 && citizens<1000000) {
            System.out.println("Велике місто");
        }
        else{
            System.out.println("Місто мільйонер");
        }


        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println(" ");


        //Виконати завдання 2, використовуючи оператори циклу.
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("Завдання 4");
        int[] numbers = new int[4];
        System.out.println("Введіть число 1");
        numbers[0]=scanner.nextInt();
        System.out.println("Введіть число 2");
        numbers[1]=scanner.nextInt();
        System.out.println("Введіть число 3");
        numbers[2]=scanner.nextInt();
        System.out.println("Введіть число 4");
        numbers[3]=scanner.nextInt();

        int sum=0;
        int count=0;
        double avg;
        StringBuilder output = new StringBuilder();

        for (int i=0; i<numbers.length;i++){
            output.append("Введено число: ").append(numbers[i]).append("\n");
            if(numbers[i]<0){
                sum+=numbers[i];
                count++;
            }
        }

        if (count == 0) {
            output.append("Не введено жодного від'ємного числа");
        }
        else{
            avg = (double) sum / count;
            output.append("Сума від'ємних: ").append(sum).append("\n");
            output.append("Кількість: ").append(count).append("\n");
            output.append("Середнє: ").append(avg).append("\n");
        }

        System.out.println(output);

        System.out.println("-------------------------------------------------------------------------------------------------------");
    }
}
