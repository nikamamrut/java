//q3
public class AnimalTest {
  // Animal interface with an abstract method "sound" and a default method "walk"
  interface Animal {
    void sound();
    default void walk() {
      System.out.println("Walking...");
    }
  }
  
  // Cat class that implements the Animal interface
  static class Cat implements Animal {
    @Override
    public void sound() {
      System.out.println("Meow!");
    }
  }
  
  // Dog class that implements the Animal interface
  static class Dog implements Animal {
    @Override
    public void sound() {
      System.out.println("Woof!");
    }
  }
  
  // Main method to create objects of the Cat and Dog classes and call their methods
  public static void main(String[] args) {
    Cat cat = new Cat();
    cat.sound();
    cat.walk();
    
    Dog dog = new Dog();
    dog.sound();
    dog.walk();
  }
}