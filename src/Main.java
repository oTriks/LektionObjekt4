public class Main {
    public static void main(String[] args) {

        Course c = new Course("java");
// String name = c.getTeacher().getName();   crash för att läraren är "null"


        //  Teacher t = c.getTeacher();
        // String name = t.getName();         crash
        Teacher david = new Teacher("David", 1000);
        c.setTeacher(david);          // crash om vi glömmer denna koden
        Teacher t = c.getTeacher();


        if (t != null) {
            String name = t.getName();           // farlig rad då den kan bli null , lägg till if sats
            double salary = t.getSalary();
            System.out.println(name + " tjänar " + salary + "kr");
        }
    }   // man kan skriva ut null, men inte använda en funktion t ex getName() på null då blir det crash
}