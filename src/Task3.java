import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //Обчислити значення функцiї, заданої в таблицi (у вiдповiдностi з варiантом завдання). Здiйснити вивiд значень
        //у вигляді таблицi.
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("Завдання 1");
        System.out.println("Початок обчислення");

        System.out.printf("%-10s %-20s%n", "Значення і", "Результат");
        double a = 2.1;
        double b = 1.8;
        double c = -20.5;
        double result;
        for(int i=0; i<=12;i++){
            if(i<4){
                result = a/i+b*(Math.pow(i,2))+c;
            }
            else if (4<=i && i<=6) {
                result = i;
            }
            else{
                result = a*i+b*Math.pow(i,3);
            }
            System.out.printf("%-10s %-20s%n", i, result);
        }


        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println(" ");

    }
}
