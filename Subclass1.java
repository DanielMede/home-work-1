
public class Subclass1 extends Abstractclass{
    
    protected String[] grades;
    
    
    public Subclass1( String name){
    super(name);
    this.grades = new String[10];
    
    
    }
    
    @Override
    public String toString(){
    return"Student: " + name;
    }
}