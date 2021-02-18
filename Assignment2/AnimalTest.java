
/** 
 * <h1>AnimalTest</h1>
 * <p>
 * The class implement main() method to create one instance of your classes 
 * Dog, Cat, Racoon, and Whale
 * and exam the output of some functionalities On each instance call of each class.
 *
 * @author Diem.Vu
 */
public class AnimalTest {
   /**
   * This is the main method which creates one instance of classes Dog, Cat, Racoon, and Whale.
   * The method will return results of functionalities that are called from different classes
   * includes dog.bark(), cat.sound(), racoon.eat(), racoon.scratch(), whale.sleep(), 
   * 
   * @param args Unused.
   * @see IOException
   */
    public static void main(String[]args){
        /**
         * Creating instances of Dog, Cat, Raccoon, and Whale.
         */
        Dog dog = new Dog("doggy", 2, "male", 2.1);
        Cat cat = new Cat("Doraemi", 5, "female", 4.3);
        Racoon racoon = new Racoon("Racoon", 2, "male", 3.5);
        Whale whale = new Whale("shark", 7, "male", 5.9);
        
        /**
         * Calling out some instance methods and print results separate by the new line.
         */
        System.out.println("\n");
        dog.bark();
        System.out.println("\n");
        cat.sound();
        cat.greetHuman();
        System.out.println("\n");
        racoon.eat();
        racoon.scratch();
        System.out.println("\n");
        whale.sleep();
        System.out.println("\n");
        
        /**
         * terminating the program
         */
        System.out.println("Thank you for visiting");
        System.out.println("\n");
    }
        
}
