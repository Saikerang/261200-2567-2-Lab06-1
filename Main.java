public class Main {
    public static void main(String[] args) {

        Cow cow = new Cow();
        cow.sound();

        Duck donald = new Duck("Donald");
        donald.sound();
        Duck daisy = new Duck("Daisy");
        daisy.sound();

        Pig burin = new Pig();
        burin.sound();

        Owl hedwig = new Owl();
        hedwig.sound();

        donald.clean(cow);
        daisy.clean(donald);

        PekingDuck mk = new PekingDuck("MK");
        mk.fly();

        mk.clean(donald);

        Duck x = new PekingDuck("X");
        donald.clean(new Cow());



    }
}