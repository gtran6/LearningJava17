public class StudentProfile {
    String firstName;
    String lastName;
    String major;
    double gpa;
    int expectedYearToGraduate;

    public StudentProfile(String firstName, String lastName, String major, double gpa, int expectedYearToGraduate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.gpa = gpa;
        this.expectedYearToGraduate = expectedYearToGraduate;
    }

    public void incrementExpectedYearToGraduate() {
        this.expectedYearToGraduate = this.expectedYearToGraduate + 1;
    }
}
