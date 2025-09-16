import java.util.ArrayList;

public class Teacher extends Individual {
    ArrayList<String> subjects = new ArrayList<>();
    String dateOfHire;
    String occupation;
    String subject;

   public Teacher(String firstName, String lastName, String subject, String dateOfHire) {
       this.firstName = firstName;
       this.lastName = lastName;
       this.subject = subject;
       this.occupation = Occupation.Teacher.name();
       this.dateOfHire = dateOfHire;
   }
}
