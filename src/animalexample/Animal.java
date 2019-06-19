
package animalexample;

/**
 *
 * @author paulbonenfant
 */
public class Animal {
    
    protected String name;
    
    public Animal(String name) {
        this.name = name;
    }
    
    public String play() {
        return "Default play from Animal";
    }
    
    public String makeSound(){
        return "Default makeSound from Animal";
    }

}
