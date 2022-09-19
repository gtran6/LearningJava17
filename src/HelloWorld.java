import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        String question = "What is the largest planet in the solar system?";
        String choiceOne = "earth";
        String choiceTwo = "jupiter";
        String choiceThree = "saturn";
        String correctAnswer = choiceTwo;

        System.out.println(question);
        System.out.println("choose: " + choiceOne + ", " + choiceTwo + ", " + choiceThree);
        Scanner sc = new Scanner( System.in );
        String input = sc.next();

        if (correctAnswer.equals( input.toLowerCase() )) {
            System.out.println("congratz");
        } else {
            System.out.println("incorrect");
        }
    }
}
