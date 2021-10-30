
package cardriverclasses;


public class Driver {
    
public Driver(String Name, String lastName, int age) {
        this.Name = Name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Driver: " + "Name = " + Name + ", lastName = " + lastName + ", age = " + age;
    }

    private String Name;
    private String lastName;
    int age;

    
}
