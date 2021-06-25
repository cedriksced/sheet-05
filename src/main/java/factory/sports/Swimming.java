package factory.sports;

public class Swimming implements Sport {

    private final WaterType type;
    private final String ascii = """
                           ___
                          /___\\   \s
                      .-.|=0-0=|.-. \s
                 (\\_.'.-\\ \\_o_/`/-.'._/)
             ~` - ~`-^_`~ -_~ ^- ~_` -~ _
                -  ~  -  ^   - ~ -  ~  -""";

    public Swimming(WaterType type) {
        this.type = type;
    }

    @Override
    public void perform() {
        System.out.println("I am swimming in a " + type);
        System.out.println(ascii);
    }
}
