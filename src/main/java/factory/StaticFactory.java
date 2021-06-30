package factory;

import factory.sports.*;

public class StaticFactory {

              public static Sport createWalk(Ground ground)  {return new Walking(ground); }

              public static Sport createRun(Ground ground, double speed) { return new Running(ground, speed); }

              public static Sport createSwim(WaterType type) { return new Swimming(type); }
}
