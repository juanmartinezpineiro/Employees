package employee;


public class EmployeeBuilder {

    private String newLastName;
    private String newMiddleName;
    private String newFirstName;
    private long newId;
    private int newBirthYear;
    private int newBirthMonth;
    private int newBirthDate;
    private int newHireYear;
    private int newHireMonth;
    private int newHireDate;

    public EmployeeBuilder() {
    }

    public EmployeeBuilder setNewLastName(String newLastName) {
        this.newLastName = newLastName;
        return this;
    }

    public EmployeeBuilder setNewMiddleName(String newMiddleName) {
        this.newMiddleName = newMiddleName;
        return this;
    }

    public EmployeeBuilder setNewFirstName(String newFirstName) {
        this.newFirstName = newFirstName;
        return this;
    }

    public EmployeeBuilder setNewId(long newId) {
        this.newId = newId;
        return this;
    }

    public EmployeeBuilder setNewBirthYear(int newBirthYear) {
        this.newBirthYear = newBirthYear;
        return this;
    }

    public EmployeeBuilder setNewBirthMonth(int newBirthMonth) {
        this.newBirthMonth = newBirthMonth;
        return this;
    }

    public EmployeeBuilder setNewBirthDate(int newBirthDate) {
        this.newBirthDate = newBirthDate;
        return this;
    }

    public EmployeeBuilder setNewHireYear(int newHireYear) {
        this.newHireYear = newHireYear;
        return this;
    }

    public EmployeeBuilder setNewHireMonth(int newHireMonth) {
        this.newHireMonth = newHireMonth;
        return this;
    }

    public EmployeeBuilder setNewHireDate(int newHireDate) {
        this.newHireDate = newHireDate;
        return this;
    }

    public Employee createEmployee() {
        return new Employee(newLastName, newMiddleName, newFirstName, newId, newBirthYear, newBirthMonth, newBirthDate, newHireYear, newHireMonth, newHireDate);
    }

}
