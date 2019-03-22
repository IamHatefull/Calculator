import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        String action;
        Scanner scanner = new Scanner(System.in);


        System.out.println("What kind of numbers would you prefer: roman or arabic?");
        String choice = scanner.next();
        System.out.println("Your choice is " + choice);

        if (choice.equals("roman")) {

            RomMath res = new RomMath();

            String First = scanner.next();
            String Second = scanner.next();

            System.out.println("Choose your action:");
            action = scanner.next();

            if (action.equals("+")) {

                System.out.println(res.TranslateToString(res.plus(res.TranslateToInt(First),res.TranslateToInt(Second))));
            }
            else if (action.equals("-")) {
                System.out.println(res.TranslateToString(res.minus(res.TranslateToInt(First),res.TranslateToInt(Second))));
            }
            else if (action.equals("*")) {
                System.out.println(res.TranslateToString(res.multiply(res.TranslateToInt(First),res.TranslateToInt(Second))));
            }
            else if (action.equals("/")) {
                System.out.println(res.TranslateToString(res.division(res.TranslateToInt(First),res.TranslateToInt(Second))));
            }
            else
                System.out.println("Wrong action!");

        } else if (choice.equals("arabic")) {

            Math result = new Math();

            int first = scanner.nextInt();
            int second = scanner.nextInt();

            System.out.println("Choose your action:");
            action = scanner.next();

            if (action.equals("+"))
                System.out.println(result.plus(first, second));

            else if (action.equals("-"))
                System.out.println(result.minus(first, second));

            else if (action.equals("*"))
                System.out.println(result.multiply(first, second));

            else if (action.equals("/"))
                System.out.println(result.division(first, second));

            else
                System.out.println("Wrong action!");

        } else {
            System.out.println("Sorry! You make a mistake!");

        }
    }
    }

