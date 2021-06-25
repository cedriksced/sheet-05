package observer;

import observer.model.BBQ;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("""
                           Commands:
                           steak (add <smell level> | remove <index>)
                           dog (add <name> <max smell level> | remove <name>)
                           """.stripIndent());

        BBQ bbq = new BBQ();
        Controller controller = new Controller(bbq, new ConsoleView(bbq));

        boolean run = true;
        Scanner in = new Scanner(System.in);

        while (run) {
            System.out.print("Input Command: ");

            if (in.hasNextLine()) {
                try {
                    System.out.println();
                    controller.handleInput(in.nextLine());
                    System.out.println();
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid Input");
                }
            } else {
                run = false;
            }
        }
    }
}
