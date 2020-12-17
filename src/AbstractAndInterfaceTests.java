public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals=new Animal[2];
        Animal chicken = new Chicken();
        Animal tiger = new Tiger();
        animals[0]=chicken;
        animals[1]=tiger;
        for (Animal animal :animals
             ) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken){
                Fruit fruit =(Chicken) animal;
                System.out.println(fruit.howToEat());
            }

        }
        Fruit[] fruits=new Fruit[2];
        Fruit apple = new Apple();
        Fruit orange = new Orange();
        fruits[0]=apple;
        fruits[1]=orange;
        for (Fruit fruit:fruits
             ) {
            System.out.println(fruit.howToEat());
        }
        
    }
}
