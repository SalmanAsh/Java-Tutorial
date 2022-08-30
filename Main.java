import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

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
        // int in;

        // do {
        // Scanner scann = new Scanner(System.in);
        // System.out.println("Type 10...");
        // System.out.print("Type a number: ");
        // in = scann.nextInt();

        // } while (in != 10);

        // Sets
        Set<Integer> s = new HashSet<Integer>();
        s.add(5);
        s.add(4);
        s.add(3);
        s.add(2);
        s.add(5);
        s.add(-5);
        s.remove(5);
        System.out.println(s);

        Boolean l = s.contains(5);

        // Lists
        ArrayList<Integer> p = new ArrayList<Integer>();
        p.add(1);
        p.add(50);
        p.add(1);
        p.add(6);

        System.out.println(p);

        /// Hash maps
        Map m = new HashMap();

        m.put("salman", "21");
        m.put("joe", "19");
        m.put("saj", "27");

        System.out.println(m);
        System.out.println(m.get("salman"));

        boolean i = m.containsValue("19");
        System.out.println(i);

        // Dog class
        dog D1 = new dog("tim", 4);
        D1.speak();

        int get = D1.getAge();
        System.out.println(get);

        D1.setAge(10);
        D1.speak();

        // Cat class
        Cat C1 = new Cat("billy", 10, 100);
        C1.speak();

        Cat C2 = new Cat("billy", 10);
        C2.speak();

        Cat C3 = new Cat("billy");
        C3.speak();

        // Static variables
        dog D2 = new dog("joe", 6);
        dog D3 = new dog("bill", 6);
        System.out.println(dog.count);
        dog.count = 7;
        System.out.println(dog.count);
        System.out.println(D3.count);

        // Static methods

    }
}