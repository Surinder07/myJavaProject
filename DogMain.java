package Assignment;

public class DogMain {
    public static void main(String[] args) {

        Dog d = new Dog();
        Dog d1 = new Dog();

        d.breed="Labrador";

        d.height =5;
        d.name="Tommy";
        d.dogTag="Dt123";

        d.run();
        d1.run();
        d1.run();

    }
}
