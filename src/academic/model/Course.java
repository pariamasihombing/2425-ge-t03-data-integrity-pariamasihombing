package academic.model;

/**
 * @author 12S23022 P. Santa Hillary Sitorus
 * @author 12S23034 Pariama Valentino Sihombing
 */


public class Course {
    private final String code;
    private final String name;
    private final int credits;
    private String grade;

    public Course(String code, String name, int credits, String grade) {
        this.code = code;
        this.name = name;
        this.credits = credits;
        this.grade = grade;
    }

    public String getCode() { return code; }
    public String getName() { return name; }
    public int getCredits() { return credits; }
    public String getGrade() { return grade; }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return code + "|" + name + "|" + credits + "|" + grade;
    }
}
