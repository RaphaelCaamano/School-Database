# School-Database:
Coded a program with a console menu that takes the input of school course information, faculty information, and student information to write out to a file. The program can also read in an existing text file, parse the information for display to console, and have some functions to display which student has the most amount of credits.


+------------------------------------------------------+
|                     Person                           |
|------------------------------------------------------|
| - name: String                                       |
| - id: String                                         |
| - address: String                                    |
|------------------------------------------------------|
| + getDetails(): String                               |
+------------------------------------------------------+
           /|\                         /|\
            |                           |
            |                           |
            
+----------------------+     +-----------------------+     +---------------------+
|      Employee        |     |       Student         |     |       Faculty       |
|----------------------|     |-----------------------|     |---------------------|
| - salary: double     |     | - major: String       |     | - department: String|
| - hireDate: Date     |     | - year: int          |     | - officeNumber: String|
|----------------------|     |-----------------------|     |---------------------|
| + getRole(): String  |     | + enrollCourse()     |     | + teachCourse()     |
+----------------------+     +-----------------------+     +---------------------+
            |                          |
            |                          |
            
+--------------------------+  +---------------------------+
|    GeneralStaff          |  |        Course             |
|--------------------------|  |---------------------------|
| - department: String     |  | - courseCode: String      |
| - shift: String          |  | - courseName: String      |
|--------------------------|  | - credits: int            |
| + performDuties(): void  |  |---------------------------|
+--------------------------+  | + getCourseInfo(): String |
                               +---------------------------+



# Information:
The project is mostly coded in: <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="40" height="40"/> </a> 
<img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/javascript/javascript-original.svg" alt="javascript" width="40" height="40"/> </a>
