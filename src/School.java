import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class School {
    /*
    TODO: Implement following methods
    addStudent(firstName, lastName, personalNumber, schoolYear);
    addTeacher(firstName, lastName, subjects, dateOfHire);
    addCourse(courseName, courseCode, coursePoints);
    addGrade(grade, date, comment);
    addClassroom(roomNumber, roomCapacity, roomAmenities);
     */
    static School singleObject;
    public static School getInstance(){
        if(singleObject == null){
            singleObject = new School();
        }
        return singleObject;
    }

    Map<String, Student> students = new HashMap<>();
    Map<String, Teacher> teachers = new HashMap<>();

     public void createStudent(String firstName, String lastName, String personalNumber, int schoolYear) {
        if (this.students.containsKey(firstName)) {
            this.students.get(firstName);
        }
        else {
            Student s = new Student(firstName, lastName, personalNumber, schoolYear);
            this.students.put(firstName, s);
        }
    }

    Teacher createTeacher(String firstName, String lastName, String subject, String dateOfHire){
        if (this.teachers.containsKey(firstName)) {
            return this.teachers.get(firstName);
        }
        else {
            Teacher t = new Teacher(firstName, lastName, subject, dateOfHire);
            this.teachers.put(firstName, t);
            return t;
        }
    }

    public void displaySchoolMenu() {
        System.out.println("1. Show all students");
        System.out.println("2. Show all teachers");
        System.out.println("3. Show all classrooms");
        System.out.println("0. Quit school");
    }

    public void startSchool (){
        createStudent("Tamas", "Tazlo", "19700101", 1);
        Scanner scanner = new Scanner(System.in);
        boolean quitMainLoop = false;
        while (!quitMainLoop) {
            displaySchoolMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Rensa newline

            switch (choice) {
                case 1 -> {
                    System.out.println("Showing all students:");
                }
                case 2 -> {
                    System.out.println("Show all teachers:");
                }
                case 3 -> {
                    System.out.println("Show all classrooms:");
                }
                case 0 -> {
                    System.out.println("Too cool for school");
                    quitMainLoop = true;
                }
            }
        }
        scanner.close();
    }
}
