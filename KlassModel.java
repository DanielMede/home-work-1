import java.util.ArrayList;

/**
 * Klassmodellen hanterar Teacher och Student objekt.
 * Klassen hanterar även all bussiness logic/ program-logik
 * @author 96danmed
 */
public class KlassModel {
    private ArrayList<Abstractclass> persons;
    
    public KlassModel(){
        persons = new ArrayList<>();
        
    }
    
    public void addPerson( Abstractclass p ){
    persons.add( p );
    
    }
    public String printClass(){
        String str = "";
        for(int i = 0; i < persons.size(); i++){
            str += persons.get(i).toString() + "\n";
            
        }
        
        return str;
        
    }
}
