package academic.model;

/**
 * @author 12S23022 P. Santa Hillary Sitorus
 * @author 12S23034 Pariama Valentino Sihombing
 */

public class Student {
    private final String nim;
    private final String name;
    private final int year;
    private final String department;

    public Student(String nim, String name, int year, String department) {
        this.nim = nim;
        this.name = name;
        this.year = year;
        this.department = department;
    }

    public String getNim() { return nim; }
    public String getName() { return name; }
    public int getYear() { return year; }
    public String getDepartment() { return department; }

    @Override
    public String toString() {
        return nim + "|" + name + "|" + year + "|" + department;
    }
}
