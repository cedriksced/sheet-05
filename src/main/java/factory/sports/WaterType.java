package factory.sports;
public enum WaterType {

    RIVER("river"),
    LAKE("lake"),
    SEA("sea"),
    POOL("pool");

    private final String value;

    WaterType(String value) {
        this.value = value;
    }


    @Override
    public String toString() {
        return value;
    }
}
