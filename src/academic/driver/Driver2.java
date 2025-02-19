package academic.driver;

import academic.model.Course;
import academic.model.Enrollment;
import academic.model.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @autor 12S23034 Pariama Valentino
 * @autor 12S23022 P. Santa Hillary Sitorus
 */

public class Driver2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Course> courses = new ArrayList<>();
        List<Student> students = new ArrayList<>();
        List<Enrollment> enrollments = new ArrayList<>();
        List<String> invalidMessages = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("---")) {
                break;
            }
            String[] parts = input.split("#");
            String command = parts[0];

            switch (command) {
                case "course-add":
                    if (parts.length == 5) {
                        String code = parts[1];
                        String name = parts[2];
                        int credits = Integer.parseInt(parts[3]);
                        String grade = parts[4];
                        courses.add(new Course(code, name, credits, grade));
                    }
                    break;
                case "student-add":
                    if (parts.length == 5) {
                        String id = parts[1];
                        String name = parts[2];
                        int year = Integer.parseInt(parts[3]);
                        String major = parts[4];
                        students.add(new Student(id, name, year, major));
                    }
                    break;
                case "enrollment-add":
                    if (parts.length == 5) {
                        String courseCode = parts[1];
                        String studentId = parts[2];
                        String academicYear = parts[3];
                        String semester = parts[4];

                        // Validasi keberadaan course
                        Course course = findCourse(courses, courseCode);
                        if (course == null) {
                            invalidMessages.add("invalid course|" + courseCode);
                            continue;
                        }

                        // Validasi keberadaan student
                        Student student = findStudent(students, studentId);
                        if (student == null) {
                            invalidMessages.add("invalid student|" + studentId);
                            continue;
                        }

                        // Jika valid, tambahkan enrollment
                        enrollments.add(new Enrollment(courseCode, studentId, academicYear, semester));
                    }
                    break;
            }
        }

        // Cetak pesan invalid
        for (String message : invalidMessages) {
            System.out.println(message);
        }

        // Cetak daftar course
        for (Course course : courses) {
            System.out.println(course);
        }

        // Cetak daftar student
        for (Student student : students) {
            System.out.println(student);
        }

        // Cetak daftar enrollment
        for (Enrollment enrollment : enrollments) {
            System.out.println(enrollment);
        }

        scanner.close();
    }

    // Metode bantu untuk mencari course berdasarkan kode
    private static Course findCourse(List<Course> courses, String courseCode) {
        for (Course c : courses) {
            if (c.getCode().equals(courseCode)) {
                return c;
            }
        }
        return null;
    }

    // Metode bantu untuk mencari student berdasarkan ID
    private static Student findStudent(List<Student> students, String studentId) {
        for (Student s : students) {
            if (s.getId().equals(studentId)) {
                return s;
            }
        }
        return null;
        
    }
}