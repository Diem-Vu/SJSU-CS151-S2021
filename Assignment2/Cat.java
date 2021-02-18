
/**
 * <h1>Cat</h1>
 * The Cat class is a type of animal and implements interface Scratcher
 * <p>
 * It defines or inherits the following attributes of class Animal including: 
 * type, name, age, male or female, living environment, and speed. 
 * The class contains the functionalities of Animal: move(), sound(), eat(), sleep(), toString(). 
 * The class implements actions from interface Scratcher and Domesticated.
 * 
 * @author Diem.Vu
 * @version 1.0
 */
public class Cat extends Animal implements Scratcher, Domesticated{


    public Cat(String name, int age, String gender, double speed) {
        super("cat", name, age, gender, "house", speed);
    }

    @Override
    public void scratch() {
        System.out.println("Cat may scratch");
    }

    @Override
    public void walk() {
        System.out.println("Cat walks");
    }

    @Override
    public void greetHuman() {
        System.out.println("Cat greets people");
    }
    
    
    
    
}
