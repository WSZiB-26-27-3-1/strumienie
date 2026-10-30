package pl.edu.wszib.java.strumienie;

import java.util.List;
import java.util.stream.Stream;

public class App {
    static void main() {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10,11,12);

        Stream<Integer> stream = list.stream();
        
    }
}
