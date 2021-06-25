package observer;

import observer.model.BBQ;

import java.util.Scanner;
import java.util.function.Supplier;

public class Controller {

    private final BBQ bbq;
    private final ConsoleView view;

    public Controller(BBQ bbq, ConsoleView view) {
        this.bbq = bbq;
        this.view = view;
    }

    public void handleInput(String input) {
        Scanner in = new Scanner(input);

        ensure(in::hasNext);
        switch (in.next().toUpperCase()) {
            case "STEAK" -> handleSteak(in);
            case "DOG" -> handleDog(in);
            default -> throw new IllegalArgumentException("Invalid Input");
        }

        view.display();
    }

    private void handleSteak(Scanner in) {
        ensure(in::hasNext);
        switch (in.next().toUpperCase()) {
            case "ADD" -> {
                ensure(in::hasNextInt);
                bbq.addSteak(in.nextInt());
            }
            case "REMOVE" -> {
                ensure(in::hasNextInt);
                bbq.removeSteak(in.nextInt());
            }
            default -> throw new IllegalArgumentException("Invalid Input");
        }
    }

    private void handleDog(Scanner in) {

        ensure(in::hasNext);
        switch (in.next().toUpperCase()) {
            case "ADD" -> {
                ensure(in::hasNext);
                String name = in.next();
                ensure(in::hasNextInt);
                int maxSmellLevel = in.nextInt();

                bbq.addDog(name, maxSmellLevel);
            }
            case "REMOVE" -> {
                ensure(in::hasNext);
                bbq.removeDog(in.next());
            }
            default -> throw new IllegalArgumentException("Invalid Input");
        }
    }

    private void ensure(Supplier<Boolean> hasXYZ) {
        if (!hasXYZ.get()) {
            throw new IllegalArgumentException("Missing Input");
        }
    }
}
