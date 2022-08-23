import java.sql.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // primitive
        int age = 30;
        double num = 30.0;
        boolean b = true;
        char c = 'o';

        // Reference
        String str = "Hello, how are you?";
        int tim = age;

        int x;
        x = 6;

        System.out.println(x);

        // operations
        int y = 7;
        int z = 56;
        int sum = x + y + z;
        System.out.println(sum);

        // taking powers
        double d = Math.pow(x, y);
        System.out.println(d);

        // type casting
        double u = x / (double) y;
        System.out.println(u);

        // remainder
        int r = 56 % 5;
        System.out.println(r);

        // input
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Age: ");
        // String scanned = sc.next();
        // System.out.println("You are " + scanned + "!");

        // convert data type
        // Scanner scan = new Scanner(System.in);
        // System.out.print("Age: ");
        // String scann = scan.next();
        // int i = Integer.parseInt(scann);
        // System.out.println("You are " + i);

        // comparison operator
        int a = 6;
        int f = 5;
        int t = 2;
        boolean compare = a != f;
        System.out.println(compare);

        // multiple comparisons
        boolean comp = a > f && t < f;
        System.out.println(comp);

        boolean comparison = f > a || t > f;
        System.out.println(comparison);

        boolean compari = !(f > a || t > f);
        System.out.println(compari);

        // IF / ELSE / ELSE IF
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        if (s.equals("Tim")) {
            System.out.println("You typed tim");
        } else if (s.equals("hello")) {
            System.out.println("hello");
        } else {
            System.out.println("You typed something else");
        }
    }
}