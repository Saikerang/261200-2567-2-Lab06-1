public class Duck extends Animal implements Flyable {
    String name;
    public Duck (String name){
        this.name = name;
    }
    public String toString(){
        return name;
    }

    @Override
    void sound() {
        System.out.println("graph");
    }

    @Override
    public void fly() {
        System.out.println("Prbbb");
    }

    @Override
    public void glide() {
        System.out.println("Flwww");
    }

    void clean(Animal animal){
        System.out.println(this + " is cleaning " + animal);
        System.out.println(this.toString() + " is cleaning " + animal);
    }


}
