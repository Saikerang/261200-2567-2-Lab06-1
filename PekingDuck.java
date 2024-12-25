public class PekingDuck extends Duck{
    PekingDuck(String name){
        super(name);
    }

    @Override
    void clean(Animal animal) {
        super.clean(animal);
        System.out.println("+++");
    }
}
