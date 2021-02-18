

/**
 * <h1>Whale</h1>
 * The Whale class is a type of animal and implements interface Swimmer
 * <p>
 * It defines or inherits the following attributes of class Animal including: 
 * type, name, age, male or female, living environment, and speed. 
 * The class contains the functionalities of Animal: move(), sound(), eat(), sleep(), toString(). 
 * The class implements actions from interface Swimmer.
 * 
 * @author Diem.Vu
 * @version 1.0
 */

public class Whale extends Animal implements Swimmer{

    /**
     * Constructor through Parent class constructor
     * @param name
     * @param age
     * @param gender
     * @param speed
     */
    public Whale(String name, int age, String gender, double speed) {
        super("Whale", name, age, gender, "ocean", speed);
    }

    @Override
    public void Swim() {
        System.out.println("Whale swims in the ocean");
    }
    
}
