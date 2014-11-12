

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class KlasslistaGUI extends JFrame{
    
    /*
     * Gui-komponenter
     */
    private Dimension dimFrame, dimButton, dimTXF;
    
    private JMenuBar menu;
    private JMenu archive;
    private JMenuItem terminate;
    private JMenu about;
    private JMenuItem om;
    private JMenuItem copyright;
    
    private JTabbedPane jtp;
    private JPanel pteacher, pstudent, pclass;
    private JTextField txfTeacher, txfStudent, txfGrades;
    private JTextArea txaStudents;
    private JTextArea txaTeachers;
    private JButton btnAddTeacher, btnAddStudent, btnPrintStudents, btnPrintTeachers, btnAddGrades;
    private JLabel lblTeacher, lblStudent, lblPrint, lblGrades;
    
    
    /*
     * Modell variabler
     */
    private KlassModel classModel;
    
    public KlasslistaGUI(){
        this.initGUI();
        this.classModel = new KlassModel();
    }
    
    
    private void initGUI(){
        //Standard strolekar för GUI-komponenterna
        this.dimFrame = new Dimension(300, 400);
        this.dimTXF = new Dimension(125, 50);
        this.dimButton = new Dimension(125, 30);
        //inställingnar för JFramen
        this.setTitle("Klasslista");
        this.setSize( dimFrame);
        this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        
        //Skapar menyerna
        
        this.menu = new JMenuBar();
        this.archive = new JMenu("Arkiv");
        this.terminate = new JMenuItem("Avsluta programmet");
        
        this.setJMenuBar(menu);
        this.menu.add(archive);
        this.archive.add(terminate);
        
        this.terminate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
        
        this.about = new JMenu("Om");
        this.om = new JMenuItem("Om");
        
        this.setJMenuBar(menu);
        this.menu.add(about);
        this.about.add(om);
        
        
        
        //Flikarna skapas
        this.jtp = new JTabbedPane();
        this.add(jtp);
        
        this.pclass = new JPanel();
        this.pstudent = new JPanel();
        this.pteacher = new JPanel();
       
        this.jtp.addTab("Teacher", pteacher);
        this.jtp.addTab("Student", pstudent);
        this.jtp.addTab("Class", pclass);
        
        /*
         * Teacher-fliken Flow Layuot Manager
         */
        this.lblTeacher = new JLabel("Teacher to add");
        this.txfTeacher = new JTextField();
        this.txfTeacher.setPreferredSize (dimTXF);
        
        this.btnAddTeacher = new JButton("Add teacher");
        this.btnAddTeacher.setPreferredSize(dimButton);
        this.btnAddTeacher.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                classModel.addTeacher(new Subclass2(txfTeacher.getText()));
                txfTeacher.setText("");
            }
        });
        
        this.pteacher.add(this.lblTeacher);
        this.pteacher.add(this.txfTeacher);
        this.pteacher.add(this.btnAddTeacher);
        
        
       /*
        * Student-fliken Flow Layuot Manager
        */
        this.lblStudent = new JLabel("Student to add");
        this.txfStudent = new JTextField();
        this.txfStudent.setPreferredSize (dimTXF);
        
        this.btnAddStudent = new JButton("Add student");
        this.btnAddStudent.setPreferredSize(dimButton);
        this.btnAddStudent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                classModel.addStudents(new Subclass1(txfStudent.getText()));
                txfStudent.setText("");
            }
        });
        
        this.pstudent.add(this.lblStudent);
        this.pstudent.add(this.txfStudent);
        this.pstudent.add(this.btnAddStudent);
        
        
        /*
         * Betyg
         */
        
        this.lblGrades = new JLabel("Add grades");
        this.txfGrades = new JTextField();
        this.txfGrades.setPreferredSize(dimTXF);
        
        this.btnAddGrades = new JButton("Add grades");
        this.btnAddGrades.setPreferredSize(dimButton);
        this.btnAddGrades.addActionListener(new ActionListener(){
        @Override
            public void actionPerformed(ActionEvent e) {
                classModel.
        }
        });
        
        
        this.pstudent.add(this.lblGrades);
        this.pstudent.add(this.txfGrades);
        this.pstudent.add(this.btnAddGrades);
        
        /*
         * Klass-fliken BorderLayout
         */
        
        this.pclass.setLayout( new BorderLayout(10, 10));
        this.lblPrint = new JLabel("Print class");
        this.txaStudents = new JTextArea(10, 25);
        this.txaStudents.setEditable(false);
        
        this.btnPrintStudents = new JButton("Print students");
        this.btnPrintStudents.setPreferredSize(dimButton);
        this.btnPrintStudents.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String str = classModel.printStudents();
                txaStudents.setText(str);
                
            }
        });
        this.txaTeachers = new JTextArea(10, 25);
        this.txaTeachers.setEditable(false);
        
        this.btnPrintTeachers = new JButton("Print teachers");
        this.btnPrintTeachers.setPreferredSize(dimButton);
        this.btnPrintTeachers.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String str = classModel.printTeachers();
                txaTeachers.setText(str);
                
            }
        });
        this.pclass.add(this.lblPrint, BorderLayout.NORTH);
        this.pclass.add(this.txaStudents, BorderLayout.WEST);
        this.pclass.add(this.txaTeachers, BorderLayout.EAST);
        this.pclass.add(this.btnPrintTeachers, BorderLayout.SOUTH);
        this.pclass.add(this.btnPrintStudents, BorderLayout.NORTH);
        
        
        
        
    }
    
    
//Följande rader säkrar att GUI:et startar i EDT.
    public static void main(String[] args) {
       java.awt.EventQueue.invokeLater(new Runnable(){
           public void run() {
               new KlasslistaGUI().setVisible(true);
           }
       });
    }
}

