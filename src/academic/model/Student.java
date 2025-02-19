package academic.model;

/**
 * @author 12S23022 P. Santa Hillary Sitorus
 * @author 12S23034 Pariama Valentino Sihombing
 */

public class Student {
    private final String id;
    private final String name;
    private final int year;
    private final String department;

    public Student(String id, String name, int year, String department) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.department = department;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public int getYear() { return year; }
    public String getDepartment() { return department; }

    @Override
    public String toString() {
        return id + "|" + name + "|" + year + "|" + department;
    }
}
