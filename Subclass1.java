
public class Subclass1 extends Abstractclass{
    /*
     * Student klass
     */
    String[] grades;
    
    
    public Subclass1( String name){
    super(name);
    this.grades = new String[10];
    
    
    }
    
    public void addGrades(String grades){
        
        
    }
    @Override
    public String toString(){
    return"Student: " + name + "Betyg" + grades;
    }
}