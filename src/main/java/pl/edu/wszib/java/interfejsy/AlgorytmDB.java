package pl.edu.wszib.java.interfejsy;

public class AlgorytmDB {

    public void calculate() {
        downloadData();
        step1();
        step2();
        step3();
        saveData();
    }

    private void downloadData() {
        System.out.println("pobieram dane z bazy ...");
    }

    private void step1() {
        System.out.println("licze s1 ...");
    }

    private void step2() {
        System.out.println("licze s2 ...");
    }

    private void step3() {
        System.out.println("licze s3 ...");
    }

    private void saveData() {
        System.out.println("zapisuje dane do bazy ...");
    }
}
