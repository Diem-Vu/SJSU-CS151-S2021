

/**
 * <h1>Dog</h1>
 * The Dog class is a type of animal and implements Domesticated interface
 * <p>
 * It defines or inherits the following attributes of class Animal including: 
 * type, name, age, male or female, living environment, and speed. 
 * The class contains the functionalities of Animal: move(), sound(), eat(), sleep(), toString(). 
 * The class contains the following functionality: bark(). 
 * The class implements actions from interface Domesticated.
 * 
 * @author Diem.Vu
 * @version 1.0
 */

public class Dog extends Animal implements Domesticated{

    public Dog(String name, int age, String gender, double speed) {
        super("Dog", name, age, gender, "house", speed);
    }
 
    public void bark(){
        System.out.println("Dog barks gaugau");
    }

    @Override
    public void walk() {
        System.out.println("Dog can walk"); 
    }

    @Override
    public void greetHuman() {
        System.out.println("Dog can greet people");
    }
    
    
    
}
