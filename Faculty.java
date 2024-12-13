public class Faculty extends Employee implements Comparable<Person> {
    private Course[] coursesTaught;
    private int numCoursesTaught;
    private boolean isTenured;

    public Faculty() {
        coursesTaught = new Course[100];
        numCoursesTaught = 0;
        isTenured = false;
    }

    public Faculty(boolean isTenured) {
        coursesTaught = new Course[100];
        numCoursesTaught = 0;
        this.isTenured = isTenured;
    }

    public Faculty(String deptName, boolean isTenured) {
        super.setDeptName(deptName);
        coursesTaught = new Course[100];
        numCoursesTaught = 0;
        this.isTenured = isTenured;
    }

    public Faculty(String name, int birthYear, String deptName, boolean isTenured) {
        super(name, birthYear, deptName);
        coursesTaught = new Course[100];
        numCoursesTaught = 0;
        this.isTenured = isTenured;
    }

    public boolean isTenured() {
        return isTenured;
    }

    public int getNumCoursesTaught() {
        return numCoursesTaught;
    }

    public void setIsTenured(boolean isTenured) {
        this.isTenured = isTenured;
    }

    public void addCourseTaught(Course course) {
        if (numCoursesTaught < 100) {
            coursesTaught[numCoursesTaught] = course;
            numCoursesTaught++;
        }
    }

    public void addCoursesTaught(Course[] courses) {
        for (Course course : courses) {
            addCourseTaught(course);
        }
    }

    public Course getCourseTaught(int index) {
        if (index >= 0 && index < numCoursesTaught) {
            return coursesTaught[index];
        }
        return null;
    }

    public String getCourseTaughtAsString(int index) {
        Course course = getCourseTaught(index);
        if (course != null) {
            return course.getDept() + "-" + course.getNum();
        }
        return "";
    }

    public String getAllCoursesTaughtAsString() {
        StringBuilder coursesString = new StringBuilder();
        for (int i = 0; i < numCoursesTaught; i++) {
            coursesString.append(getCourseTaughtAsString(i));
            if (i < numCoursesTaught - 1) {
                coursesString.append(", ");
            }
        }
        return coursesString.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (obj instanceof Faculty) {
            Faculty faculty = (Faculty) obj;
            return isTenured == faculty.isTenured && numCoursesTaught == faculty.numCoursesTaught
                    && Arrays.equals(coursesTaught, faculty.coursesTaught);
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%s Faculty: %s | Number of Courses Taught: %d |Courses Taught: %s", super.toString(), isTenured ? "Tenured" : "Not Tenured", numCoursesTaught,
                getAllCoursesTaughtAsString());
    }

    @Override
    public int compareTo(Person p) {
        if (p instanceof Faculty) {
            Faculty otherFaculty = (Faculty) p;
            return Integer.compare(this.numCoursesTaught, otherFaculty.numCoursesTaught);
        }
        return -1;
    }
}

public class Course {
    private String dept;
    private int num;

    public Course(String dept, int num) {
        this.dept = dept;
        this.num = num;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
