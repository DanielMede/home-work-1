import java.util.ArrayList;

/**
 * Klassmodellen hanterar Teacher och Student objekt.
 * Klassen hanterar även all bussiness logic/ program-logik
 * @author 96danmed
 */
public class KlassModel {
    private ArrayList<Abstractclass> teachers;
    private ArrayList<Abstractclass> students;
    
    public KlassModel(){
        teachers = new ArrayList<>();
        students = new ArrayList<>();
    }
    
    public void addStudents( Abstractclass p ){
        students.add( p );
    
    }
    public String printStudents(){
        String str = "";
        for(int i = 0; i < students.size(); i++){
            str += students.get(i).toString() + "\n";
            
        }
        
        return str;
        
    }
    
    public void addTeacher( Abstractclass p ){
    teachers.add( p );
    
    }
    public String printTeachers(){
        String str = "";
        for(int i = 0; i < teachers.size(); i++){
            str += teachers.get(i).toString() + "\n";
            
        }
        
        return str;
        
    }
}
