public class Chicken extends Animal implements Fruit{
    @Override
    public String makeSound() {
        return "o o o o o";
    }

    @Override
    public String howToEat() {
        return "could be cooked";
    }
}
