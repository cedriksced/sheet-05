package factory.sports;

public class Running extends Walking {

    private final double speed;

    public Running(Ground ground, double speed) {
        super(ground);
        this.speed = speed;
        super.ascii = """
                            _( }
                   -=  _  <<  \\
                      `.\\__/`/\\\\
                 -=     '--'\\\\  `
                      -=    //
                            \\)""";
    }

    @Override
    public void perform() {
        System.out.println("I am running on " + ground + " with a speed of " + speed + " km/h");
        System.out.println(ascii);
    }
}
