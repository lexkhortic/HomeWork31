package Task4;

import java.util.ArrayList;
import java.util.Comparator;

public class Task4 {

    public static Comparator<TV> sortByPriceUp = (c1, c2) -> {
        return Double.compare(c1.getPrice(), c2.getPrice());
    };

    public static Comparator<TV> sortByPriceDown = (c1, c2) -> {
        return -Double.compare(c1.getPrice(), c2.getPrice());
    };

    public static Comparator<TV> sortByDiagonalUp = (c1, c2) -> {
        return Integer.compare(c1.getDiagonal(), c2.getDiagonal());
    };

    public static Comparator<TV> sortByDiagonalDown = (c1, c2) -> {
        return -Integer.compare(c1.getDiagonal(), c2.getDiagonal());
    };

    public static void main(String[] args) {
        ArrayList<TV> tvs = new ArrayList<>();
        tvs.add(new TV("LG2212", 2013, 1000, 42,Manufacturer.LG));
        tvs.add(new TV("SNY123", 2020, 1500, 55,Manufacturer.SONY));
        tvs.add(new TV("PH3456", 2010, 950, 38,Manufacturer.PHILIPS));
        tvs.add(new TV("LG3456", 2022, 3000, 86,Manufacturer.LG));
        tvs.add(new TV("HRZ878", 2016, 526, 38,Manufacturer.HORIZONT));

        tvs.forEach(System.out::println);

        System.out.println("\nТелевизоры с диагональю 38\":");
        tvs.stream()
                .filter(tv -> tv.getDiagonal() == 38)
                .forEach(System.out::println);

        System.out.println("\nТелевизоры LG:");
        tvs.stream()
                .filter(tv -> tv.getManufacturer() == Manufacturer.LG)
                .forEach(System.out::println);

        System.out.println("\nТелевизоры 2022 года:");
        tvs.stream()
                .filter(tv -> tv.getYear() == 2022)
                .forEach(System.out::println);

        System.out.println("\nТелевизоры больше 1000$:");
        tvs.stream()
                .filter(tv -> tv.getPrice() >= 1000)
                .forEach(System.out::println);

        System.out.println("\nСортировка по цене по возрастанию:");
        tvs.stream()
                .sorted(sortByPriceUp)
                .forEach(System.out::println);

        System.out.println("\nСортировка по цене по убыванию:");
        tvs.stream()
                .sorted(sortByPriceDown)
                .forEach(System.out::println);

        System.out.println("\nСортировка по диагонали по возрастанию:");
        tvs.stream()
                .sorted(sortByDiagonalUp)
                .forEach(System.out::println);

        System.out.println("\nСортировка по диагонали по убыванию:");
        tvs.stream()
                .sorted(sortByDiagonalDown)
                .forEach(System.out::println);

    }
}
