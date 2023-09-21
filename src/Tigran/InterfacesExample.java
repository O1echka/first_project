package Tigran;

public class InterfacesExample {

    public static void main(String[] args) {
        Duck duck = new Duck();
        CanLive[] canLives = new CanLive[] { duck, new Person()};
        CanFly[] canFlies = new CanFly[] { duck, new Plane()};

        for(CanFly canFly : canFlies) {
            canFly.fly();
        }

        for(CanLive canLive : canLives) {
            canLive.live();
        }
    }

    public interface CanFly {
        void fly();
    }

    public interface CanLive {
        void live();
    }

    public static class Duck implements CanFly, CanLive {

        @Override
        public void fly() {
            System.out.println("I am duck, I can fly");
        }

        @Override
        public void live() {
            System.out.println("I am duck, I can live");
        }
    }

    public static class Plane implements CanFly {

        @Override
        public void fly() {
            System.out.println("I am plane, I can fly");
        }
    }

    public static class Person implements CanLive {

        @Override
        public void live() {
            System.out.println("I am a person, I can live");
        }
    }
}
