# School-Database:
Coded a program with a console menu that takes the input of school course information, faculty information, and student information to write out to a file. The program can also read in an existing text file, parse the information for display to console, and have some functions to display which student has the most amount of credits.

@startuml
skinparam backgroundColor #000000
skinparam classBorderColor #FFFFFF
skinparam classAttributeTextColor #FFFFFF
skinparam classFontColor #FFFFFF
skinparam classFontSize 14

class Person {
  - name: String
  - id: String
  - address: String
  + getDetails(): String
}

class Employee {
  - salary: double
  - hireDate: Date
  + getRole(): String
}

class Student {
  - major: String
  - year: int
  + enrollCourse()
}

class Faculty {
  - department: String
  - officeNumber: String
  + teachCourse()
}

class GeneralStaff {
  - department: String
  - shift: String
  + performDuties()
}

class Course {
  - courseCode: String
  - courseName: String
  - credits: int
  + getCourseInfo()
}

Person <|-- Employee
Person <|-- Student
Person <|-- Faculty
Employee <|-- GeneralStaff
Student "1" -- "*" Course : enrolls in
Faculty "1" -- "*" Course : teaches
@enduml



# Information:
The project is mostly coded in: <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="40" height="40"/> </a> 
<img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/javascript/javascript-original.svg" alt="javascript" width="40" height="40"/> </a>
