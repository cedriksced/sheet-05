package factory;

import factory.sports.*;

public class SingletonFactory {
        public static SingletonFactory instance = null;

        private SingletonFactory() {

        }

        public static SingletonFactory getInstance() {
            if (instance == null) instance = new SingletonFactory();
            return instance;

        }

        public Sport createWalk(Ground ground)  {return new Walking(ground); }

        public Sport createRun(Ground ground, double speed) { return new Running(ground, speed); }

        public Sport createSwim(WaterType type) { return new Swimming(type); }

}
