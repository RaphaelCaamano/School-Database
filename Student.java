import java.util.Arrays;

public class Student extends Person implements Comparable<Person> {
    private static int numStudents;
    private int studentID;
    private Course[] coursesTaken;
    private int numCoursesTaken;
    private boolean isGraduate;
    private String major;

    public Student() {
        super();
        coursesTaken = new Course[50];
        numCoursesTaken = 0;
        isGraduate = false;
        major = "undeclared";
        studentID = generateStudentID();
    }

    public Student(boolean isGraduate) {
        super();
        coursesTaken = new Course[50];
        numCoursesTaken = 0;
        this.isGraduate = isGraduate;
        major = "undeclared";
        studentID = generateStudentID();
    }

    public Student(String major, boolean isGraduate) {
        super();
        coursesTaken = new Course[50];
        numCoursesTaken = 0;
        this.isGraduate = isGraduate;
        this.major = major;
        studentID = generateStudentID();
    }

    public Student(String name, int birthYear, String major, boolean isGraduate) {
        super(name, birthYear);
        coursesTaken = new Course[50];
        numCoursesTaken = 0;
        this.isGraduate = isGraduate;
        this.major = major;
        studentID = generateStudentID();
    }

    public boolean isGraduate() {
        return isGraduate;
    }

    public int getNumCoursesTaken() {
        return numCoursesTaken;
    }

    public static int getNumStudents() {
        return numStudents;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getMajor() {
        return major;
    }

    public void setIsGraduate(boolean isGraduate) {
        this.isGraduate = isGraduate;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void addCourseTaken(Course course) {
        if (numCoursesTaken < coursesTaken.length) {
            coursesTaken[numCoursesTaken] = course;
            numCoursesTaken++;
        }
    }

    public void addCoursesTaken(Course[] courses) {
        for (Course course : courses) {
            addCourseTaken(course);
        }
    }

    public Course getCourseTaken(int index) {
        if (index >= 0 && index < numCoursesTaken) {
            return coursesTaken[index];
        }
        return null;
    }

    public String getCourseTakenAsString(int index) {
        if (index >= 0 && index < numCoursesTaken) {
            return coursesTaken[index].getCourseDept() + "-" + coursesTaken[index].getCourseNum();
        }
        return "";
    }

    public String getAllCoursesTakenAsString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numCoursesTaken; i++) {
            sb.append(getCourseTakenAsString(i));
            if (i < numCoursesTaken - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Student)) {
            return false;
        }
        Student other = (Student) obj;
        return super.equals(obj) && studentID == other.studentID && Arrays.equals(coursesTaken, other.coursesTaken)
                && numCoursesTaken == other.numCoursesTaken && isGraduate == other.isGraduate
                && major.equals(other.major);
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Student: studentID: %04d | Major %20s | %14s | Number of Courses Taken: %3d | Courses Taken: %s",
                studentID, major, (isGraduate ? "Graduate" : "Undergraduate"), numCoursesTaken, getAllCoursesTakenAsString());
    }

    private int generateStudentID() {
        numStudents++;
        return numStudents;
    }

    @Override
    public int compareTo(Person p) {
        if (p instanceof Student) {
            Student other = (Student) p;
            return Integer.compare(numCoursesTaken, other.numCoursesTaken);
        }
        return -1; // Or throw an exception if you prefer
    }
}
