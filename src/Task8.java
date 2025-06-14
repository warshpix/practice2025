import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        //Ввести прізвище, ім’я та по-батькові як одне текстове дане. Розв'язати задачу відповідно до вашого варіанта.
        //Вивести прізвище та кількість букв у імені.
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("Завдання 1");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть прізвище, ім'я та по-батькові");
        String fullName = scanner.nextLine();

        String[] parts = fullName.split(" ");

        if (parts.length >= 2) {
            String lastName = parts[0];
            String firstName = parts[1];

            System.out.println("Прізвище: " + lastName);
            System.out.println("Кількість букв у імені: " + firstName.length());
        } else {
            System.out.println("Будь ласка, введіть повне ім'я у форматі 'Прізвище Ім'я По-батькові'.");
        }

        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println(" ");
    }
}
