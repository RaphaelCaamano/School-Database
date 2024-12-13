import java.util.Objects;

public class Course implements Comparable<Course> {
    private boolean isGraduateCourse;
    private int courseNum;
    private String courseDept;
    private int numCredits;

    public Course(boolean isGraduateCourse, int courseNum, String courseDept, int numCredits) {
        this.isGraduateCourse = isGraduateCourse;
        this.courseNum = courseNum;
        this.courseDept = courseDept;
        this.numCredits = numCredits;
    }

    public boolean isGraduateCourse() {
        return isGraduateCourse;
    }

    public int getCourseNum() {
        return courseNum;
    }

    public String getCourseDept() {
        return courseDept;
    }

    public int getNumCredits() {
        return numCredits;
    }

    public String getCourseName() {
        String type = isGraduateCourse ? "G" : "U";
        return type + courseDept + courseNum;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Course other = (Course) obj;
        return isGraduateCourse == other.isGraduateCourse &&
                courseNum == other.courseNum &&
                courseDept.equals(other.courseDept) &&
                numCredits == other.numCredits;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isGraduateCourse, courseNum, courseDept, numCredits);
    }

    @Override
    public String toString() {
        return String.format("Course: %3s-%3d | Number of Credits: %02d  | Graduate/Undergraduate: %s",
                courseDept, courseNum, numCredits, isGraduateCourse ? "Graduate" : "Undergraduate");
    }

    @Override
    public int compareTo(Course other) {
        return Integer.compare(courseNum, other.courseNum);
    }
}
