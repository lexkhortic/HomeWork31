package Task3;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", 2012, 15000, "RED", 2.2));
        cars.add(new Car("KIA", 2007, 7500, "WHITE", 1.6));
        cars.add(new Car("AUDI", 2020, 35000, "BLACK", 2.1));
        cars.add(new Car("RENO", 2008, 6500, "RED", 1.6));
        cars.add(new Car("LADA", 2000, 1000, "WHITE", 1.4));

        cars.forEach(System.out::println);

        System.out.println("Машины КРАСНОГО цвета:");
        cars.stream()
                .filter(car -> car.getColor().equalsIgnoreCase("RED"))
                .forEach(System.out::println);

        System.out.println("Машины объемом 1.6 л:");
        cars.stream()
                .filter(car -> car.getVolume() == 1.6)
                .forEach(System.out::println);

        System.out.println("Машины больше 10.000$:");
        cars.stream()
                .filter(car -> car.getPrice() > 10_000)
                .forEach(System.out::println);

        System.out.println("Машины с годом выпуска от 2008 до 2022:");
        cars.stream()
                .filter(car -> car.getYear() >= 2008 && car.getYear() <= 2022)
                .forEach(System.out::println);
    }
}
