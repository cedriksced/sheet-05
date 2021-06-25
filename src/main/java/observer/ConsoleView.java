package observer;

import observer.model.BBQ;
import observer.model.Dog;
import observer.model.Steak;

import java.util.List;

public class ConsoleView {

    private final BBQ bbq;

    public ConsoleView(BBQ bbq) {
        this.bbq = bbq;
    }

    public void display() {
        List<Steak> steaks = bbq.viewSteaks();
        List<Dog> dogs = bbq.viewDogs();

        System.out.println("The BBQ has " + steaks.size() + " steaks and there are " + dogs.size() + " dogs.");
        System.out.println();
        System.out.println("The steaks are: ");
        steaks.forEach(System.out::println);
        System.out.println();
        System.out.println("The dogs are: ");
        dogs.forEach(System.out::println);
    }
}
