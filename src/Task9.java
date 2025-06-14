import java.util.Arrays;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        //Знайти добуток 5 перших елементiв  ряду:
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("Завдання 1");

        int a = 1;
        double[] array = new double[]{1,1,1,1,1};
        double mult = 1;

        for(int i=0; i<array.length-1;i++){
            array[i+1]=1/array[i]+Math.pow((1 + array[i]), 0.5);
        }

        for(int i=0; i<array.length;i++){
            mult*=array[i];
        }

        System.out.println("Добуток перших 5 елементів ряду - "+mult);




        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println(" ");


        //Знайти значення функцii u(x,y,z) за такими даними
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("Завдання 2");
        System.out.println("Введіть значення змінної x:");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println("Введіть значення змінної y:");
        int y = scanner.nextInt();
        System.out.println("Введіть значення змінної z:");
        int z = scanner.nextInt();

        double[] v = new double[]{0,0,0};
        v[0]=Math.pow((Math.pow(x,2)+Math.pow(y,2)),0.5);
        v[1]=Math.pow((Math.pow(x,2)+Math.pow(z,2)),0.5);
        v[2]=Math.pow((Math.pow(y,2)+Math.pow(z,2)),0.5);

        Arrays.sort(v);

        double u = v[2];
        System.out.println("Значення v:");
        for(int i=0; i<3;i++){
            System.out.println(v[i]);
        }
        System.out.println(" ");
        System.out.println("Pезультат - "+u);

        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println(" ");


        //Напишіть програму, яка буде використовувати функцію, що обчислює
        //скалярний добуток двох векторів дійсних чисел, що мають однакову розмірність.
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("Завдання 3");
        System.out.println("Введіть довжину векторів");
        int length = scanner.nextInt();
        System.out.println("Введіть кут між ними");
        int degree = scanner.nextInt();
        double vectorMult=0;

        if(length<=0){
            System.out.println("невірно введена довжина векторів");
        }
        else{
            if(degree<0 || degree>360){
                System.out.println("Невірно введений кут");
            }
            else{
                vectorMult =  length * length * Math.cos(degree);
            }
        }

        System.out.println(vectorMult);
    }
}
