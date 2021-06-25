package factory.sports;

public enum Ground {

    EARTH("earth"),
    STONE("stone"),
    TARTAN("tartan track"),
    ASPHALT("asphalt");

    private final String value;

    Ground(String value) {
        this.value = value;
    }


    @Override
    public String toString() {
        return value;
    }
}
