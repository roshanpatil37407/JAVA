//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 2; i++) {
            System.out.println("outer: " + i);

            for (int j = 1; j <= 3; j++) {
                System.out.println("inner: " + j);
            }

        }
    }
}