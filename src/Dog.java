import Animal;
import Protector;

public class Dog extends Animal implements Protector {
    @Override
    public void sound() {
        System.out.println("Bark!!!");
    }
}
