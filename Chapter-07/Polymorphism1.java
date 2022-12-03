public class Polymorphism1 
{
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Wolf();
        animals[3] = new Hippo();
        animals[4] = new Lion();

        for(Animal animal : animals)
        {
            animal.eat();
            animal.roam();
        }
    }

}
