import java.sql.Date;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

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
        // Scanner scan = new Scanner(System.in);
        // String s = scan.nextLine();

        // if (s.equals("Tim")) {
        // System.out.println("You typed tim");
        // } else if (s.equals("hello")) {
        // System.out.println("hello");
        // } else {
        // System.out.println("You typed something else");
        // }

        // arrays
        String[] newArr = new String[5];
        newArr[0] = "hello";
        newArr[1] = "hi";
        newArr[2] = "bye";
        newArr[3] = "bill";
        newArr[4] = "joe";

        String xy = newArr[3];
        System.out.println(xy);

        int[] nume = { 2, 3, 5, 7, 10 };

        int xz = nume[4];
        System.out.println(xz);

        // For loops
        int[] arr = { 1, 5, 7, 3, 4, 5 };

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 5) {
                System.out.println("Found a 5 at " + i);
            }
        }

        // more loops
        int[] arra = { 1, 5, 7, 3, 4, 5 };
        String[] names = new String[5];
        Scanner scan = new Scanner(System.in);

        // int count = 0;
        // for (int element : arra) {
        // System.out.println(element);
        // count++;
        // }

        // for (int i = 0; i < names.length; i++) {
        // System.out.print("Input: ");
        // String input = scan.nextLine();
        // names[i] = input;
        // }

        // for (String n : names) {
        // System.out.println(n);
        // if (n.equals("hi")) {
        // break;
        // }
        // }

        // While loops
        // Scanner scann = new Scanner(System.in);
        // System.out.print("Type a number: ");
        // int in = scann.nextInt();

        // int count = 0;
        // while (in != 10) {
        // System.out.println("Type 10...");
        // System.out.print("Type a number: ");
        // in = scann.nextInt();
        // count++;
        // }
        // System.out.print("You tried " + count + " times.");

        // do while loop
        int in;

        do {
            Scanner scann = new Scanner(System.in);
            System.out.println("Type 10...");
            System.out.print("Type a number: ");
            in = scann.nextInt();

        } while (in != 10);

    }
}