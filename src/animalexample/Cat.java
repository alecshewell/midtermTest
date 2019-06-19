
package animalexample;

/**
 *
 * @author paulbonenfant
 */
public class Cat extends Animal {
    
    public Cat(String name) {
        super(name);
    }
    

    @Override
    public String makeSound() {
        return "Meow!";
    }
    
    public String makeSound(boolean isScared) {
        if (isScared) {
            return "Hisss!";
        }
        
        return makeSound();
        
        
    }
    
}
