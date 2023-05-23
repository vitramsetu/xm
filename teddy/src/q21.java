import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private int grade;
    private List<String> courses;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    public void addCourse(String course) {
        courses.add(course);
        System.out.println("Added course: " + course);
    }

    public void removeCourse(String course) {
        if (courses.contains(course)) {
            courses.remove(course);
            System.out.println("Removed course: " + course);
        } else {
            System.out.println("Course not found: " + course);
        }
    }

    public void displayCourses() {
        System.out.println("Courses for " + name + ":");
        for (String course : courses) {
            System.out.println(course);
        }
    }
}

public class q21 {
    public static void main(String[] args) {
        Student student = new Student("John", 10);

        student.addCourse("Math");
        student.addCourse("Science");
        student.addCourse("English");
        student.displayCourses();

        student.removeCourse("Science");
        student.displayCourses();

        student.removeCourse("History"); // Trying to remove a course that doesn't exist
    }
}
