package chapter10;

public class Zoo {
    public static void main(String args[]){
        Dog ciapek = new Dog();
        ciapek.fetch();
        ciapek.makeSound();
        feed(ciapek);

        Animal nico = new Dog();
        nico.makeSound();
        feed(nico);

        nico = new Cat();
        nico.makeSound();
        ((Cat) nico).scratch();
        feed(nico);
    }
    public static void feed(Animal animal){
        if (animal instanceof Dog){
            System.out.println("This's your dog food!");
        }
        else if (animal instanceof Cat){
            System.out.println("This's your cat food!");
        }
    }
}
