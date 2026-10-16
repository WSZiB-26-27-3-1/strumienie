package pl.edu.wszib.java.interfejsy;

public class App {
    static void main() {
        SimpleInterface simpleInterface = new SimpleInterfaceImpl();
        int x = simpleInterface.cos();
        System.out.println(x);
        simpleInterface.x();

        /*interfejsy.Algorytm algorytm = new interfejsy.Algorytm();
        algorytm.calculate();*/

        AlgorytmDB algorytmDB = new AlgorytmDB();
        algorytmDB.calculate();

        Algorytm algorytm = new AlgorytmWeb();
        algorytm.calculate();
    }
}
