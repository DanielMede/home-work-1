import java.util.ArrayList;

/**
 * Klassmodellen hanterar Teacher och Student objekt.
 * Klassen hanterar även all bussiness logic/ program-logik
 * @author 96danmed
 */
public class KlassModel {
    private ArrayList<Abstractclass> Teachers;
    private ArrayList<Abstractclass> Students;
    
    public KlassModel(){
        Teachers = new ArrayList<>();
        
    }
    
    public void addStudents( Abstractclass p ){
    Students.add( p );
    
    }
    public String printStudents(){
        String str = "";
        for(int i = 0; i < Students.size(); i++){
            str += Students.get(i).toString() + "\n";
            
        }
        
        return str;
        
    }
    
    public void addTeacher( Abstractclass p ){
    Teachers.add( p );
    
    }
    public String printTeachers(){
        String str = "";
        for(int i = 0; i < Teachers.size(); i++){
            str += Teachers.get(i).toString() + "\n";
            
        }
        
        return str;
        
    }
}
