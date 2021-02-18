
/**
 * <h1>Racoon</h1>
 * The Racoon class is a type of animal and implements interface Scratcher
 * <p>
 * It defines or inherits the following attributes of class Animal including: 
 * type, name, age, male or female, living environment, and speed. 
 * The class contains the functionalities of Animal: move(), sound(), eat(), sleep(), toString(). 
 * The class implements actions of interface Scratcher.
 * 
 * @author Diem.Vu
 * @version 1.0
 */

public class Racoon extends Animal implements Scratcher{
    /**
     *
     * @param name
     * @param age
     * @param gender
     * @param speed
     */
    public Racoon(String name, int age, String gender, double speed) {
        super("Racoon", name, age, gender, "forest", speed);
    }

    /**
     *implement methods from interface Scratcher
     */
    @Override
    public void scratch() {
        System.out.println("Racoon scratchs");
    }
    
    
}
