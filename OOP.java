import java.util.Scanner;

public class OOP {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // scan.next();

        sal("hello", 4);
        System.out.println(add2(6));

    }

    public static void sal(String str, int x) {
        for (int i = 0; i < x; i++) {
            System.out.println(str);
        }
    }

    public static int add2(int x) {
        return x + 2;
    }

}
