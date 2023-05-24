class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

class stud {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public stud(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age should be between 15 and 21.");
        }

        if (!isValidName(name)) {
            throw new NameNotValidException("Name is not valid. It should not contain numbers or special symbols.");
        }

        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    private boolean isValidName(String name) {
        return name.matches("[a-zA-Z ]+");
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }
}

public class q24 {
    public static void main(String[] args) {
        try {
            stud student1 = new stud(1, "John Doe", 20, "Science");
            System.out.println("Student 1: Roll No - " + student1.getRollNo() + ", Name - " + student1.getName() +
                    ", Age - " + student1.getAge() + ", Course - " + student1.getCourse());

            // Invalid age
            stud student2 = new stud(2, "Jane Smi1th", 12, "Arts");
            System.out.println("Student 2: Roll No - " + student2.getRollNo() + ", Name - " + student2.getName() +
                    ", Age - " + student2.getAge() + ", Course - " + student2.getCourse());
        } catch (AgeNotWithinRangeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NameNotValidException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
