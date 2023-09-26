import java.util.ArrayList;

public class Course {
    private String name;
    private ArrayList<Student> students = new ArrayList<>();
    private Teacher teacher;   // om det bara är en lärare, annars måste det göras en lista

    public Course(String name) {
        this.name = name;
       //   teacher = new Teacher("unknown", 0.0);   kan göra såhär för att undvika null
 }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
       // if (teacher != null) {           fortsättning, kan göra såhär för att undvika null, inte bästa då specialvarianten av en lärare skapas, kan bli fel om en lärare faktiskt heter unknown
            this.teacher = teacher;
        }
    //}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
    this.students.add(student);              // lägger till en student i vår lista av studenter
    }
}
