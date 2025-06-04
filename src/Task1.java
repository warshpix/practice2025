import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //Скласти програму, яка запитувала б вас про ваше iм'я, мiсце народження i вiтала вас.
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("Завдання 1");
        System.out.println("Введіть своє ім'я");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Введіть своє місце народження");
        String placeOfBirth = scanner.nextLine();
        System.out.println("Вітаю, "+ name + ", з " + placeOfBirth);
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println(" ");



        //Скласти програму, яка вводила б цiле число, знаходила числа, вiдповiдно бiльшi i меншi на 1 i
        //виводила результат на екран.
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("Завдання 2");
        System.out.println("Введіть ціле число");
        Scanner scanner2 = new Scanner(System.in);
        if( scanner2.hasNextInt()){
            int number = scanner2.nextInt();
            System.out.println("Ваше число  - " + number + ", число на одиницю більше за введене - " + (number+1) + ", число на одиницю менше за введене - " + (number-1));
        }
        else {
            System.out.println("Неправильно введений тип");
        }
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println(" ");




        //Скласти програму для виводу шапки i одного рядка машинограми:
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("Завдання 3");
        System.out.printf("%-5s %-15s %-10s %-12s %-10s%n", "№", "Прiзвище", "Зарплата", "Вирахувано", "Всього");
        System.out.printf("%-5d %-15s %-10d %-12d %-10d%n", 1, "Ципердюк", 2000, 200, 1800);
        System.out.println("-------------------------------------------------------------------------------------------------------");
    }
}
