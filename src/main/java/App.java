public class App {
    static void main() {
        SimpleInterface simpleInterface = new SimpleInterfaceImpl();
        int x = simpleInterface.cos();
        System.out.println(x);
        simpleInterface.x();
    }
}
