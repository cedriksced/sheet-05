package factory;

import factory.sports.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Sport> sports = new ArrayList<>();
        SingletonFactory factory = SingletonFactory.getInstance();


        sports.add(StaticFactory.createWalk(Ground.STONE));
        sports.add(StaticFactory.createRun(Ground.ASPHALT, 7.3));
        sports.add(StaticFactory.createSwim(WaterType.POOL));

        sports.add(factory.createWalk(Ground.STONE));
        sports.add(factory.createSwim(WaterType.POOL));
        sports.add(factory.createRun(Ground.ASPHALT, 7.3));


        for (Sport sport : sports) {
            sport.perform();
        }
    }
}
