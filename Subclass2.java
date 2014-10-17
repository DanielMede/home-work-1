

public class Subclass2 extends Abstractclass{
    
    protected String[] classes;
    protected int nbrOfClasses;
    
    public Subclass2( String name){
    super(name);
    this.classes = new String[10];
    this.nbrOfClasses = 0;
    
    }
    
    @Override
    public String toString(){
    return"Lärare: " + name;
    }
}
