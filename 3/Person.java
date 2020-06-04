import java.time.LocalDateTime;
abstract class Person {
    String firstName, lastName;
    int birthYear;

    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public int getAge(){
        LocalDateTime now = LocalDateTime.now();
        int year = now.getYear();
        int age = year-birthYear;

        return age;
    }

}
