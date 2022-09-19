public class MainStudentProfile {
    public static void main(String[] args) {
        StudentProfile profileOne = new StudentProfile( "Sally", "Salmon", "Film", 3.78, 2022 );
        StudentProfile profileTwo = new StudentProfile( "Jennie", "Kim", "ComSci", 3.4, 2023 );
        profileOne.incrementExpectedYearToGraduate();
        System.out.println(profileOne.expectedYearToGraduate);
    }
}
