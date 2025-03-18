package revision;
class Animal{
    public void Sound(){
        System.out.println("Sound of animals.");
    }
}
class Dog extends Animal{
    @Override
    public void Sound() {
        System.out.println("Dog is barking.");
    }
}
class Cat extends Animal{
    @Override
    public void Sound() {
        System.out.println("Cat is mewwing.");
    }
}
public class Animal_Inheritance {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.Sound();
        Dog d = new Dog();
        d.Sound();
        Cat c = new Cat();
        c.Sound();
    }
}
