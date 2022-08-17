package Task2;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Минск");
        cities.add("Гомель");
        cities.add("Витебск");
        cities.add("Орша");
        cities.add("Могилев");
        cities.add("Минск");
        cities.add("Гродно");
        cities.add("Иртыш");
        cities.add("Брест");
        cities.add("МиНсК");

        System.out.println("Все города:");
        cities.forEach(city -> System.out.print(city + " "));

        System.out.println("\n\nГорода длинее 6 символов:");
        cities.stream()
                .filter(city -> city.length() > 6)
                .forEach(city -> System.out.print(city + " "));

        System.out.println("\n\nГорода на букву М:");
        cities.stream()
                .filter(city -> city.toUpperCase().charAt(0) == 'М')
                .forEach(city -> System.out.print(city + " "));

        System.out.print("\n\nВведите название города: ");
        String inputCity = sc.nextLine();
        System.out.println("Город " + inputCity + " встречается " + cities.stream()
                .filter(city -> city.toUpperCase().equalsIgnoreCase(inputCity))
                .count() + " раз(а)");
    }
}
