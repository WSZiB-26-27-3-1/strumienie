package pl.edu.wszib.java.anonimowe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
        Collections.sort(cars);
        System.out.println(cars);
    }
}
