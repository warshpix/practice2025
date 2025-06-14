import java.util.ArrayList;
import java.util.List;
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


        //Дано рядок, довжина якого не перевищує n символів.
        //Підрахувати кількість входжень символів «!». «?» у рядок і вивести номери
        //їх позицій. Перетворити рядок, викинувши ці символи. Якщо таких символів у
        //рядку немає, то вивести про це інформацію.
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("Завдання 2");
        System.out.println("Введіть рядок:");
        String text = scanner.nextLine();

        int exclamationCount = 0;
        int questionCount = 0;
        List<Integer> exclamationPositions = new ArrayList<>();
        List<Integer> questionPositions = new ArrayList<>();
        StringBuilder modifiedString = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == '!') {
                exclamationCount++;
                exclamationPositions.add(i);
            } else if (ch == '?') {
                questionCount++;
                questionPositions.add(i);
            } else {
                modifiedString.append(ch);
            }
        }

        if (exclamationCount == 0 && questionCount == 0) {
            System.out.println("Символів ! та ? не знайдено");
        } else {
            if (exclamationCount > 0) {
                System.out.println("Символ !: " + exclamationCount + " разів на позиціях: " + exclamationPositions);
            }
            if (questionCount > 0) {
                System.out.println("Символ ?: " + questionCount + " разів на позиціях: " + questionPositions);
            }
        }

        System.out.println("Перетворений рядок: " + modifiedString.toString());


        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println(" ");
    }
}
