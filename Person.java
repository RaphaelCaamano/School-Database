public class Person implements Comparable<Person> {
    private String name;
    private int birthYear;
   
    public Person() {
        this.name = "";
        this.birthYear = 0;
    }
   
    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }
   
    public String getName() {
        return name;
    }
   
    public int getBirthYear() {
        return birthYear;
    }
   
    public void setName(String name) {
        this.name = name;
    }
   
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
   
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Person person = (Person) obj;
        return name.equals(person.name) && birthYear == person.birthYear;
    }
   
    public String toString() {
        return String.format("Person: Name: %30s | Birth Year: %4d", name, birthYear);
    }
   
    public int compareTo(Person p) {
        return Integer.compare(birthYear, p.birthYear);
    }
}
