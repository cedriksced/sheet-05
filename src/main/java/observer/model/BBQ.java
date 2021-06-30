package observer.model;

import observer.observable.Observable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BBQ extends Observable {

    private final List<Steak> steaks;
    private final List<Dog> dogs;

    public BBQ() {
        steaks = new ArrayList<>();
        dogs = new ArrayList<>();
    }

    public void addSteak(int smellLevel) {
        steaks.add(new Steak(smellLevel));
    }

    public Steak removeSteak(int i) {
        if (i < 0 || i >= steaks.size()) {
            throw new IllegalArgumentException("Invalid Index");
        }

        Steak steak = steaks.remove(i);
        return steak;
    }

    public List<Steak> viewSteaks() {
        return Collections.unmodifiableList(steaks);
    }

    public void addDog(String name, int maxSmellLevel) {
        Dog d = new Dog(name, maxSmellLevel);
        dogs.add(d);
    }

    public void removeDog(String name) {
        dogs.removeIf(d -> {
            if (d.getName().equals(name)) {
                return true;
            } else {
                return false;
            }
        });
    }

    public List<Dog> viewDogs() {
        return Collections.unmodifiableList(dogs);
    }
}
