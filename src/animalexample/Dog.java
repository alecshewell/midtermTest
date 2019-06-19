
package animalexample;

/**
 *
 * @author paulbonenfant
 */
public class Dog extends Animal{
    
    private String owner;
    
    public Dog(String name, String owner) {
        super(name);
        this.owner = owner;
    }
    
    @Override
    public String play() {
        return this.name + " is playing with the ball"; 
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this)return true;
        
        if(obj instanceof Dog){
            // casting into dog
            Dog dog = (Dog)obj;
            
            if(this.owner.equals(dog.owner)){
                if(this.name.equals(dog.name)){
                    return true;
                }
            }
        }
        return false;
    }
    

}
