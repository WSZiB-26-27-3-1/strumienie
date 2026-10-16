package pl.edu.wszib.java.interfejsy;

public class AlgorytmWeb extends Algorytm {
    @Override
    public void downloadData() {
        System.out.println("Pobieram z neta ...");
    }

    @Override
    public void saveData() {
        System.out.println("Azpisuje do neta ...");
    }
}
