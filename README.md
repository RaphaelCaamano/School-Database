# School-Database:
Coded a program with a console menu that takes the input of school course information, faculty information, and student information to write out to a file. The program can also read in an existing text file, parse the information for display to console, and have some functions to display which student has the most amount of credits.


+--------------------------------------------------------------+
|                      UML Class Diagram                       |
|--------------------------------------------------------------|
| Person: name, address, phoneNumber                           |
|   / \                                                        |
|Student     Employee: employeeId, dept, salary                |
|             / \                                              |
|         Faculty  GeneralStaff                                |                
|       : officeHours, id   : jobTitle, schedule               |
|--------------------------------------------------------------|
| Course: courseId, name, desc, credits                        |
|   - taught by: Faculty (1..*)                                |
|   - enrolled by: Student (0..*)                              |
+--------------------------------------------------------------+


![Screenshot 2025-06-05 233233](https://github.com/user-attachments/assets/0861a8cd-b8aa-4343-bd8e-d22b49e1a5fe)



# Information:
The project is mostly coded in: <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="40" height="40"/> </a> 
<img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/javascript/javascript-original.svg" alt="javascript" width="40" height="40"/> </a>
