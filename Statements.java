import java.util.Scanner;

public class Statements {
    public static void main(String[] args) {
        System.out.print("Input your age: ");

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int age = Integer.parseInt(s);

        if (age >= 18) {
            System.out.print("Input your fav food: ");
            String food = scan.nextLine();

            if (food.equals("pizza")) {
                System.out.println("Mine too!");
            } else {
                System.out.println("not mine!");
            }
        } else if (age >= 13) {
            System.out.println("You are a teenager!");
        } else {
            System.out.println("You are not a teenager or an adult");

        }

    }

}
