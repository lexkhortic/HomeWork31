package Task1;

import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add((int)(Math.random() * 11));
        }

        list.forEach(el -> System.out.print(el + " "));

        System.out.println("\nКол-во четных: " + list
                .stream()
                .filter(el -> el % 2 == 0)
                .count());

        System.out.println("Кол-во нечетных: " + list
                .stream()
                .filter(el -> el % 2 != 0)
                .count());

        System.out.println("Кол-во нулей: " + list
                .stream()
                .filter(el -> el == 0)
                .count());

        Scanner sc = new Scanner(System.in);
        System.out.print("Введи число: ");
        int inputNum = sc.nextInt();

        System.out.print("Кол-во чисел " + inputNum + ": " + list
                .stream()
                .filter(el -> el == inputNum)
                .count());
    }
}
