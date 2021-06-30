package observer.model;

import observer.observable.Observer;

public class Dog implements Observer {

    private final String name;

    private final int maxSmellLevel;
    private boolean isRestless;



    public Dog(String name, int maxSmellLevel) {
        this.name = name;
        this.maxSmellLevel = maxSmellLevel;
        this.isRestless = false;
    }

    public String getName() {
        return name;
    }

    public boolean isRestless() {
        return isRestless;
    }

    @Override
    public String toString() {
        return "Dog " + name + " is " + (isRestless ? "" : "not ") + "restless.";
    }

    @Override
     public void update(BBQ bbq) {
        isRestless = false;



        if( smellLevel > maxSmellLevel) {
            isRestless = true;


        }






    }
}
