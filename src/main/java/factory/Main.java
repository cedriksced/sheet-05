package factory;

import factory.sports.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Sport> sports = new ArrayList<>();

        sports.add(new Walking(Ground.STONE));
        sports.add(new Running(Ground.ASPHALT, 7.3));
        sports.add(new Swimming(WaterType.POOL));

        for (Sport sport : sports) {
            sport.perform();
        }
    }
}
