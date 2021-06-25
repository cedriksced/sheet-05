package observer.model;

public class Steak {

    private final int smellLevel;

    public Steak(int smellLevel) {
        this.smellLevel = smellLevel;
    }

    public int getSmellLevel() {
        return smellLevel;
    }

    @Override
    public String toString() {
        return "Steak with smell level " + smellLevel;
    }
}
