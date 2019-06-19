
package animalexample;

/**
 *
 * @author Alec Shewell
 */
public class Hamster extends Animal{
    
    public Hamster(String name) {
        super(name);
    }
    

    @Override
    public String makeSound() {
        return "sqeek, sqeek";
    }
    @Override
    public String play(){
        return this.name + "Running on my wheel";
    }
    
    
}
