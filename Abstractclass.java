


/**
 *Personklassen beskriver ett person-objekt med tillhörande variabler.
 * @author 96danmed
 * @version 0.1
 */
public class Abstractclass {
    
    protected String name;
    /**
     * Klassens konstruktor anger ett namn till objektet
     * @param name Objektets namn.
     */
    public Abstractclass(String name){
    this.name = name;
    }
    /**
     * Hämtar objektets namn.
     * @return String med objektets namn.
     */
    public String getName() {
        return name;
    }
    /**
     * Ändrar objektets namn till name.
     * @param name String med objektets nya namn.
     * 
     */
    public void setName(String name) {
        this.name = name;
    }
    
    
}
