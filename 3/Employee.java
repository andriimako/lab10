import java.time.LocalDateTime;
public class Employee extends Person {
    int hireDate;
    double salary;
    String companyName;

    public Employee(String firstName, String lastName, int birthYear,
                    int hireDate, String companyName, double salary) {
        super(firstName, lastName, birthYear);
        this.hireDate = hireDate;
        this.companyName = companyName;
        this.salary = salary;
    }

    public int getJobSeniority() {
        LocalDateTime now = LocalDateTime.now();
        int year = now.getYear();
        int jobSeniority = year-hireDate;
        return jobSeniority;
    }

    public double getSalary() {
        return salary;
    }

    public String getCompanyName() {
        return companyName;
    }
}
