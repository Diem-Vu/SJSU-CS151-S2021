

/**
 * <h1>Animal</h1>
 * <p>
 * The class defines or inherits the following attributes of an Animal: 
 * type of the animal, name of the animal, age, male or female, 
 * which environment it lives in.
 * The class has the following functionality where the action is simply printed to command line: 
 * move(), sound(), eat(), sleep(), toString().
 * 
 * @author Diem.Vu
 * @version 1.0
 *  
 */
public class Animal {
    /**
     * The attributes of the class are set as private
     * and can be updated or achieved through getters and setters
     */
    private String type;
    private String name;
    private int age;
    private String gender;
    private String liveEnvir;
    private double speed;

    /**
     * The construction to create an Animal object using its information in arguments
     *
     * @param type
     * @param name
     * @param age
     * @param gender
     * @param liveEnvir
     * @param speed
     */
    public Animal(String type, String name, int age, String gender, String liveEnvir, double speed) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.liveEnvir = liveEnvir;
        this.speed = speed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLiveEnvir() {
        return liveEnvir;
    }

    public void setLiveEnvir(String liveEnvir) {
        this.liveEnvir = liveEnvir;
    }
    
    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
    
    /**
     * Methods that imply possible actions of an Animal, return standard output
     */
    public void move(){
//        System.out.printf("%s Animal can move\n", type);
           System.out.println(this.type + " can move.");
    }
    public void sound(){
        System.out.println("Animal makes sound");
    }
    public void eat(){
        System.out.println("Animal eats");
    }
    public void sleep(){
        System.out.println("Animal sleep");
    }

    @Override
    public String toString(){
        return type + " " + name + ", " + age + ", years, " + gender + ", live in " + liveEnvir + " move with speed " + speed + " mile/hr";
    }
    
}
