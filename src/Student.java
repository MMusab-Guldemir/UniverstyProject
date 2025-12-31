public class Student extends User{
    int gpa; // Oğrencinin not ortalamsı.

    public Student(String name, String email, int ID, int gpa){
        super(name, email, ID);
        this.gpa = gpa;
    }

    // Oğrencilerin bilgilerini ekrana yazdıran metod.
    @Override
    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("ID: " + ID);
        System.out.println("GPA: " + gpa);
    }
    
}
