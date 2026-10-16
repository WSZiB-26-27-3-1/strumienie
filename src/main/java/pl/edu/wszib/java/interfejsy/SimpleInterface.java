package pl.edu.wszib.java.interfejsy;

public interface SimpleInterface {
    int cos();
    void cosinnego();

    default void x() {
        x1();
        x2();
        x3();
        x4();
        x5();
    }

    private void x1() {
        System.out.println("x"); //bardzo dlugi kod
    }

    private void x2() {
        System.out.println("y"); //bardzo dlugi kod
    }

    private void x3() {
        System.out.println("z"); //bardzo dlugi kod
    }

    private void x4() {
        System.out.println("w"); //bardzo dlugi kod
    }

    private void x5() {
        System.out.println("q"); //bardzo dlugi kod
    }
}
