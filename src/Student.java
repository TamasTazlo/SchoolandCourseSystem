public class Student extends Individual{
    private String personalNumber;
    private int schoolYear;

    public Student(String firstName, String lastName, String personalNumber, int schoolYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.personalNumber = personalNumber;
        this.schoolYear = schoolYear;
    }
}
