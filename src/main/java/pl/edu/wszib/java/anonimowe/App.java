package pl.edu.wszib.java.anonimowe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class App {
    static void main() {
        List<Integer> numers = List.of(3,6,2,8,5,9,1,0);
        numers = new ArrayList<>(numers);

        System.out.println(numers);
        Collections.sort(numers);
        System.out.println(numers);

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Corolla", 85000));
        cars.add(new Car("Skoda", "Octavia", 105000));
        cars.add(new Car("BMW", "Seria 3", 210000));
        cars.add(new Car("Ford", "Focus", 78000));
        cars.add(new Car("Kia", "Ceed", 92000));

        System.out.println(cars);
        Collections.sort(cars,
                (x,y) -> x.getBrand().compareTo(y.getBrand()));
        System.out.println(cars);

        Function<String, Integer> funkcja = String::length;

        Collections.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getModel().compareTo(o2.getModel());
            }
        });
        System.out.println(cars);

        Car c = new Car("Fiat", "126p", 1000) {
            @Override
            public String getBrand() {
                System.out.println("Przesonieta metoda !!!");
                return super.getBrand();
            }
        };

        Function<String, Integer> f = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };

        f.apply("ABC");
        f.apply("XYZW");

        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() > 4;
            }
        };

        predicate.test("abc");
        predicate.test("xyzas");

        UnaryOperator<String> unaryOperator = s -> s+"abc";

        unaryOperator.apply("x");
        unaryOperator.apply("z");

        DuzyInterfejs duzyInterfejs = new DuzyInterfejs() {
            @Override
            public int x() {
                return 0;
            }

            @Override
            public int y() {
                return 1;
            }

            @Override
            public int z() {
                return 2;
            }
        };

        InterfejsFunkcyjny interfejsFunkcyjny = () -> 0;
    }
}
